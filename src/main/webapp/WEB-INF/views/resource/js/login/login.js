var ppwd = "";// cookie中的密码
var loginOrgid = "";// 机构账号登陆时的id,需提示用户转换为手机号登录
var artBox;
var time = 0;
var ukey = "";// 验证码
var utel = "";// 绑定手机
var countdown = 60;


function setUserCookie(){

}

$(function() {
	eventInit();
	// 设置输入框
	var loginId = $.cookie('loginId');
	ppwd = $.cookie('ppwd');
	if (loginId && loginId != "") {
		$("#loginId").val(loginId);
	}
	if (ppwd && ppwd != "") {
		$("#pwd").val("********");
		$('#divKeepPwd').checkboxGroup({
			operate : 'setKey',
			opreateDataKey : 1
		});
	}
	// 重置ticket
	//getQRCode();
	// 系统消息弹窗
	sysNoticeDialog();
})

/**
 * 事件初始化
 */
function eventInit() {
	$('.lxslider').LxSlider({
		controls : false,
		pager : true,
		auto : true,
		mode : 'fade',
		pause : 6000
	});

	// PC端下载按钮
	$("#downLoadBtn").on("click", function() {
		var span = $(".swiper-pagination").find(".swiper-pagination-switch")[1];
		if ($(span).hasClass("swiper-active-switch"))
			window.location.href = "//sso.yihu.cn/Portal/jkzlPcIntro.html";
	})

	// 登录按钮
	$("#btnLogin").click(function() {
		var loginId = $("#loginId").val();
		var pwd = $("#pwd").val();
		if ((loginId == "") || (pwd == "")) {
			showMessage("账号密码不能为空");
			return;
		}
		//loginAccess(loginId, pwd);
		//window.location.href="src/views/index.html";
		alert(123);
	});

	// 键盘监听
	$(document).keydown(function(e) {
		if ($(".forget-password-box").css('display') == 'none') {
			if (e.which == 13) {
				var loginId = $("#loginId").val();
				var pwd = $("#pwd").val();
				if ((loginId == "") || (pwd == "")) {
					showMessage("账号密码不能为空");
					return;
				}
				loginAccess(loginId, pwd);
			}
		}
	});

	// 忘记密码按钮
	$('#forget-password').click(function() {
		$("#forget-loginId").val('');
		$("#forget-YZM").val('');
		$("#forget-newPwd").val('');
		$("#forget-commitPwd").val('');
		loadTVCode($('.forget-password-box').find('.img-tvcode'));// 加载图文验证码
		var contents = $('.forget-password-box').get(0);
		artBox = art.dialog({
			lock : true,
			artIcon : 'edit',
			opacity : 0.4,
			width : 480,
			title : '忘记密码',
			content : contents,
			ok : function() {
				return resetNewPwd();
			},
			cancel : function() {
				time = 0;
			}
		});
	});

	// 验证码图片事件
	$(".img-tvcode").on("click", function() {
		loadTVCode($(this))
	});

	// 页面大小变化监听
	$(window).resize(function() {
		setFullPage(".pop-box");
		setElementCenter(".pop-box .pop-main");
	});
}

/**
 * 重置ticket
 */
function getQRCode() {
	$.ajax({
		url : "LoginAction/getCode",
		type : 'POST',
		dataType : "json",
		async : false,
		success : function(data) {
			if (data) {
				if (data.Code == "10000") {
					$.cookie('PortalTicket', data.ticket, {
						expires : 1
					});
				} else {
					if (data.Code == "-10000")
						showMessage(data.Message);
				}
			}
		},
		error : function() {
			showMessage("登录失败");
		}
	});
}

/**
 * 登录
 * 
 * @param loginId
 * @param pwd
 */
function loginAccess(loginId, pwd) {
	if (pwd != "********") {
		pwd = md5(pwd);
		console.log(pwd);
		alert(123);
	} else {
		pwd = ppwd;
	}

	$.ajax({
		url : "LoginAction/login",
		type : 'POST',
		dataType : "json",
		data : {
			loginId : loginId,
			pwd : pwd
		},
		success : function(data) {
			if (data) {
				if (data.Code == "10000") {
					$.cookie('UserID', data.Result.UserID, {
						expires : 30
					});
					$.cookie('loginId', loginId, {
						expires : 30
					});
					$.cookie('PortalTicket', data.ticket, {
						expires : 1
					});
					if ($('#divKeepPwd').checkboxGroup({
						operate : 'getKey'
					}) == 1) {
						$.cookie('ppwd', pwd, {
							expires : 30
						});
					} else {
						$.cookie('ppwd', '', {
							expires : -1
						});
					}
					var reg = /^\d{11}$/;
					if (data.orgId && !reg.test(loginId)) {
						loginOrgid = data.orgId;
						loadTVCode($(".pop-box").find(".img-tvcode"));// 加载图文验证码
						$(".pop-box").show();
					} else {
						window.location.href = "index.html?v=20180402";
					}
				} else {
					if (data.Message != undefined)
						showMessage(data.Message);
				}
			}
		},
		error : function() {
			showMessage("登录失败");
		}
	});
}

/**
 * 
 */
function reCode() {
	if (time > 0) {
		setTimeout('reCode()', 1000);
		$('.code-btn').html(time + '秒之后可再获取');
		time--;
	} else {
		$('.code-btn').html('<span class="code-btn"><a href="javascript:;" onclick="getVCode();">获取验证码</a></span>');
	}
}

/**
 * 获取验证码
 */
function getVCode() {
	var loginID = $("#forget-loginId").val();
	if (loginID == '') {
		showMessage("手机号不能为空");
		return;
	}
	var rex = /^\d{11}$/;
	if (loginID == null || loginID == '' || !rex.test(loginID)) {
		showMessage("请输入有效的手机号码");
		return;
	}
	time = 60;
	reCode();
	$.ajax({
		url : "ForgetPSDAction/getVCode",
		type : 'POST',
		data : {
			loginID : loginID
		},
		dataType : "json",
		success : function(data) {
			if (data) {
				if (data.Code == "10000") {

				} else if (data.Code == "-10000") {
					showMessage(data.Message);
				} else {
					if (data.Message != null && data.Message != "")
						showMessage(data.Message);
				}
			}
		},
		error : function() {
			showMessage("获取验证码失败");
		}
	});
}

/**
 * 重置密码
 * 
 * @returns {Boolean}
 */
function resetNewPwd() {
	var loginID = $("#forget-loginId").val();
	var loginPwd = $("#forget-newPwd").val();
	var TVCODE = $('#forget-TVCode').val();
	var VCODENUM = getTVCode();
	if (TVCODE == "") {
		showMessage("图文验证码不能为空！");
		return false;
	}
	if (VCODENUM == "" || VCODENUM == undefined) {
		showMessage("图文验证码已失效，请点击图片重新获取！");
		return false;
	}
	if (TVCODE.toUpperCase() != VCODENUM) {
		loadTVCode($('.forget-password-box').find('.img-tvcode'));// 重置验证码，避免破解
		showMessage("图文验证码不正确！");
		return false;
	}
	loadTVCode($('.forget-password-box').find('.img-tvcode'));// 重置验证码，避免破解
	if ($("#forget-loginId").val() == '') {
		showMessage("手机号不能为空");
		return false;
	}
	var rex = /^\d{11}$/;
	if (loginID == null || loginID == '' || !rex.test(loginID)) {
		showMessage("请输入有效的手机号码");
		return false;
	}
	if ($("#forget-YZM").val() == '') {
		showMessage("短信验证码不能为空");
		return false;
	}
	if ($("#forget-newPwd").val() == '') {
		showMessage("新密码不能为空");
		return false;
	}
	if ($('#forget-newPwd').val().length < 6 || $('#forget-newPwd').val().length > 12 || !isNaN($('#forget-newPwd').val())) {
		showMessage("新密码长度需为6-12位，且必须包含字母");
		return false;
	}
	if ($("#forget-commitPwd").val() == '') {
		showMessage("确认密码不能为空");
		return false;
	}
	if ($("#forget-commitPwd").val() != $("#forget-newPwd").val()) {
		showMessage("新密码与确认密码不一致");
		return false;
	}
	loginPwd = md5(loginPwd);
	var yzm = $("#forget-YZM").val();
	var success = false;

	$.ajax({
		url : "ForgetPSDAction/resetUserPwd",
		type : 'POST',
		data : {
			loginID : loginID,
			loginPwd : loginPwd,
			yzm : yzm
		},
		dataType : "json",
		success : function(data) {
			if (data) {
				if (data.Code == "10000") {
					success = true;
					showMessage(data.Message);
					time = 0;
					artBox.close();
				} else if (data.Code == "-10000") {
					showMessage(data.Message);
				} else {
					if (data.Message != null && data.Message != "")
						showMessage(data.Message);
				}
			} else {
				showMessage("重置密码失败");
			}
		},
		error : function() {
			showMessage("重置密码失败");
		}
	});
	return success;
}

/**
 * 提示框
 * 
 * @param content
 */
function showMessage(content) {
	art.dialog({
		lock : true,
		artIcon : 'ask',
		opacity : 0.4,
		width : 250,
		title : '提示',
		content : content,
		ok : function() {

		}
	});
}

/** 提示绑定的弹窗的函数 */
function setElementCenter(element) {
	var $window = $(window);
	var $element = $(element);
	var left = ($window.width() - $element.outerWidth()) / 2;
	var top = ($window.height() - $element.outerHeight()) / 2;
	$element.css({
		left : left,
		top : top
	});
}
// 全屏
function setFullPage(element) {
	var $document = $(document);
	var width = $document.width();
	var height = $document.height();
	$(element).css({
		width : width,
		height : height
	});
}

// 遮罩层 主体居中
setFullPage(".pop-box");
setElementCenter(".pop-box .pop-main");

// 关闭弹窗按钮
$(".pop-box .btn-close").on("click", function() {
	$(".pop-box").hide();
});

// 阻止事件冒泡
$(".pop-box .pop-main").on("click", function(event) {
	event.stopPropagation();
});

function yzm() {
	var tel = $("#tel").val();
	var reg = /^\d{11}$/;
	if (reg.test(tel)) {
		utel = tel;
		$.ajax({
			url : "BindMobileAction/sentMessage",
			type : 'POST',
			data : {
				mobile : tel
			},
			dataType : "json",
			success : function(data) {
				if (data) {
					ukey = data;
					settime();
				}
			},
			error : function() {
				showMessage("获取验证码失败,请重试.");
			}
		});
	} else {
		showMessage("输入的手机号码有误！");
	}
}

function settime() {
	if (countdown == 0) {
		$("#yzm").attr("class", "btn-code-num fr c-btn");
		document.getElementById('yzm').onclick = function() {
			yzm();
		};
		$("#yzm").text("获取验证码");
		countdown = 60;
	} else {
		$("#yzm").attr("class", "btn-code-num fr c-btn disable");
		document.getElementById("yzm").onclick = null;
		$("#yzm").text("重新发送(" + countdown + ")");
		countdown--;
	}
	setTimeout(function() {
		if (countdown != 60) {
			settime();
		}
	}, 1000);
}

function bind() {
	var tel = $("#tel").val();
	var NAME = $("#tNAME").val();
	var KET = $("#tKET").val();
	var TVCODE = $('#tvCode').val();
	var VCODENUM = getTVCode();
	if (TVCODE == "") {
		showMessage("图文验证码不能为空！");
		return false;
	}
	if (VCODENUM == "") {
		showMessage("图文验证码已失效，请点击图片重新获取！");
		return false;
	}
	if (TVCODE.toUpperCase() != VCODENUM) {
		loadTVCode($(".pop-box").find(".img-tvcode"));// 重置验证码，避免破解
		showMessage("图文验证码不正确！");
		return false;
	}
	loadTVCode($(".pop-box").find(".img-tvcode"));// 重置验证码，避免破解
	if (NAME == null || NAME == "") {
		showMessage("请输入姓名！");
		return;
	}
	if (NAME.length > 20) {
		showMessage("姓名长度不能超过20个字符！");
		return;
	}
	if (tel == null || tel == "") {
		showMessage("请输入绑定手机号码！");
		return;
	}
	if (KET == null || KET == "") {
		showMessage("请输入短信验证码！");
		return;
	}
	if (utel == null || utel == "") {
		showMessage("请先获取短信验证码！");
		return;
	}
	if (tel != utel) {
		showMessage("输入的手机号码与验证号码不同，请重新输入！");
		return;
	}
	if (KET != ukey) {
		showMessage("短信验证码有误，请重新输入！");
		return;
	}

	$.ajax({
		url : "BindMobileAction/bindMobile",
		type : 'POST',
		data : {
			orgid : loginOrgid,
			mobile : tel,
			name : NAME
		},
		dataType : "json",
		success : function(data) {
			if (data.Code == 111) {
				// 绑定成功时隐藏
				$(".pop-box").hide();
			}
			showMessage(data.Message);
		},
		error : function() {
			showMessage("绑定失败!");
		}
	});
}

// 设置验证码
function loadTVCode($element) {
	var $t = $.cookie('PortalTicket');
	if ($t == null || $t == '') {
		showMessage("无法获取图文验证码，请尝试刷新页面");
		return false;
	}
	var src = 'verifyCode/getC?v=' + Math.random() + '&t=' + $t;
	$element.prop('src', src);
}

// 获取图文验证码
function getTVCode() {
	var $t = $.cookie('PortalTicket');
	var result = "";
	$.ajax({
		url : "verifyCode/readCode",
		type : 'POST',
		dataType : "json",
		async : false,
		data : {
			't' : $t
		},
		success : function(data) {
			if (data) {
				if (data.Code == "10000") {
					result = data.Result;
				}
			}
		},
		error : function() {
		}
	});
	if (!result || result == "") {// Radis未能读取到验证码
		result = $.cookie('vCodeNum');
	}
	return result;
}

// 系统消息弹窗
function sysNoticeDialog() {
	$.ajax({
		url : "SysNotice/getAnnounce",
		type : 'POST',
		dataType : "json",
		success : function(data) {
			if (data.Code == 10000) {
				if (data.content) {
					var cookieDate = $.cookie('announceModifyDate');
					if (cookieDate == data.modifyDate) {
						return;
					}
					$.cookie('announceModifyDate', data.modifyDate, {
						expires : 30
					});
					// 公告
					$('#sysNoticeDiv').append(data.content);
					$('#sysNoticeDiv').find("img").attr('style', "max-width:400px;");
					var artBox = art.dialog({
						lock : true,
						artIcon : '',
						opacity : 0.4,
						width : 600,
						title : '<i class="iconfont mr5">&#xe627</i>系统公告',
						content : $('<div></div>').append($('#sysNoticeDiv')).html(),
						init : function() {
							$("#sysNoticeDiv").niceScroll({
								cursorborder : "",
								cursorcolor : "#cccdd1"
							});
						},
						ok : function() {

						}
					});
				}
			}
		},
		error : function() {
		}
	});
}