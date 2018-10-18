<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>蚁巢OA管理系统</title>

    <link rel="stylesheet" type="text/css" href="//f1.yihuimg.com/concat/cross_pc/1.1.1/iconfont/iconfont.css"/>
    <link rel="stylesheet" type="text/css" href="//f1.yihuimg.com/concat/cross_pc/1.1.1/cross/css/cross.css"/>
    <link rel="stylesheet" type="text/css" href="/css/login/landing.css?v=20181010"/>
    <!--[if lt IE 9]>
    <script type="text/javascript" src="//f1.yihuimg.com/concat/cross_pc/1.1.1/cross/js/respond.min.js"></script>
    <![endif]-->
    <link href="/images/jkzl.ico" rel="shortcut icon"/>
    <style type="text/css">
        #downLoadBtn {
            width: 122px;
            height: 44px;
            position: absolute;
            top: 255px;
            left: 620px;
            z-index: 100;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="header wraper ptb20 clearfix">
    <div class="logo fl">
        <img src="/images/logo1.png"/>
    </div>
    <div class="header-list fr c-inline-block">
        <a href="#" target="_parent">首页</a>
        <a href="//sso.yihu.cn/ApplicationUi/wbj2/login/wgw-intro.html" target="_parent">案例</a>
        <a href="//sso.yihu.cn/ApplicationUi/wbj2/login/partners.html" target="_parent">伙伴</a>
        <a href="//sso.yihu.cn/ApplicationUi/wbj2/login/news-list.html" target="_parent">公告</a>
        <a href="/login/tologinpage" target="_parent">登录</a>
    </div>
</div>
<div class="landing-main clearfix c-hidden h500">
    <div class="landing-main-adv">
        <ul class="lxslider">
            <li><a href="javascript:;" style="background-image:url(/images/new-login-img-2_1.jpg)"></a></li>
            <li><a href="javascript:;" style="background-image:url(/images/new-login-img_1.jpg)"></a></li>
        </ul>
    </div>
    <div class="landing-con-box wraper">

        <div class="landing-con bgc-fff mr50 fr">
            <div class="p30">
                <%--改进：公司信息可配置--%>
                <h2 class="c-f18 c-666 ptb10">欢迎注册蚁巢OA管理系统</h2>
                <div class="form-layout form-inline mt10">
                    <div class="control-group">
                        <div class="control-form c-position-r">
                            <input id="loginId" type="text" placeholder="请输入邮箱/手机号/帐号" class="input-text">
                            <i class="iconfont c-position-a c-999 landing-icon">&#xe60c;</i>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="control-form c-position-r">
                            <input id="pwd" type="password" placeholder="请输入密码（区分大小写）" class="input-text">
                            <i class="iconfont c-position-a c-999 landing-icon">&#xe60d;</i>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="control-form c-position-r">
                            <input id="pwd" type="password" placeholder="再次输入密码" class="input-text">
                            <i class="iconfont c-position-a c-999 landing-icon">&#xe60d;</i>
                        </div>
                    </div>

                    <div class="control-group c-100 ptb10">
                        <div class="control-form" style="height:24px">
                            <a id="btnLogin" href="javascript:;" class="c-btn-full c-btn-blue h45">注册</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="footer wraper c-t-center clearfix ptb30">
    <div class="footer-list c-999">
        <a href="//sso.yihu.cn/Portal/jkzlPcIntro.html" target="_parent">客户端</a><span>|</span>
        <a href="//sso.yihu.cn/ApplicationUi/wbj2/login/agreement.html" target="_parent">服务协议</a><span>|</span>
        <a href="//sso.yihu.cn/ApplicationUi/wbj2/login/aboutus.html" target="_parent">关于我们</a><span>|</span>
        <a href="//sso.yihu.cn/RecruiterManage/html/pc/home.html" target="_parent">加入我们</a><span>|</span>
        <a href="//sso.yihu.cn/ApplicationUi/wbj2/login/guide.html" target="_parent">新版操作手册</a><span>|</span>
        <a href="intro.html" target="_parent">新版更新指南</a>
    </div>
    <div class="footer-txt c-999 pt15">
        ©build future版权所有
    </div>
</div>

<!-- 忘记密码弹窗 -->
<div class="forget-password-box" style="display:none">
    <table class="form">
        <tr>
            <td>手机号：</td>
            <td><input type="text" id="forget-loginId" class="input-text" value=""/></td>
        </tr>
        <tr>
            <td>图文验证码：</td>
            <td><input type="text" id="forget-TVCode" class="input-text code" value=""/><img src="" class="img-tvcode"/>
            </td>
        </tr>
        <tr>
            <td>短信验证码：</td>
            <td><input type="text" id="forget-YZM" class="input-text code" value=""/> <span class="code-btn"><a
                    href="javascript:;" onclick="getVCode();">获取验证码</a></span></td>
        </tr>
        <tr>
            <td>新密码：</td>
            <td><input type="password" id="forget-newPwd" class="input-text" value=""/></td>
        </tr>
        <tr>
            <td>确认新密码：</td>
            <td><input type="password" id="forget-commitPwd" class="input-text" value=""/></td>
        </tr>
    </table>
</div>

<!-- 提示绑定的弹窗 -->
<div class="pop-box pop-bin-phone" style="display: none">
    <div class="pop-main pop-width">
        <a class="btn-close first" href="javascript:;"></a>
        <div class="tips">
            <p>
                您当前尚未绑定手机号码，为不影响您继续使用该平台，请尽快绑定手机号码！
            </p>
        </div>
        <div class="inner">
            <div class="group">
                <input type="text" id="tNAME" placeholder="您的姓名">
            </div>
            <div class="group">
                <input type="text" id="tel" placeholder="您的手机号码">
            </div>
            <div class="group">
                <input class="code-num" type="text" id="tvCode" placeholder="图文验证码"/>
                <img class="img-vcode fr img-tvcode" src=""/>
            </div>
            <div class="group clearfix">
                <input class="code-num" id="tKET" type="text" placeholder="短信验证码">
                <button id="yzm" class="btn-code-num fr c-btn" onclick="yzm()">获取验证码</button>
            </div>
            <div class="group tips-block">
                <p class="c-333 c-f12">【如有疑问,请联系管理员】</p>
            </div>
            <div class="group">
                <button class="btn-full" onclick="bind()">立即绑定</button>
            </div>
        </div>
    </div>
</div>

<!-- 系统公告 -->
<div id="sysNoticeDiv" class="c-auto-y" style="max-height:450px;max-width:600px;word-break: break-all;"></div>

<script src="//f1.yihuimg.com/TFS/upfile/realfile/1000000/yihuSjax.js"></script>
<script type="text/javascript" src="//f1.yihuimg.com/concat/cross_pc/1.1.1/cross/js/jquery/1.8.3/jquery.js"></script>
<script type="text/javascript" src="//f1.yihuimg.com/concat/cross_pc/1.1.1/cross/js/cross.ui.js"></script>
<link rel="stylesheet" href="//f1.yihuimg.com/concat/cross_pc/1.1.1/widget/artDialog/4.1.7/css/artDialog.min.css"
      type="text/css"/>
<script type="text/javascript"
        src="//f1.yihuimg.com/concat/cross_pc/1.1.1/widget/artDialog/4.1.7/js/artDialog.min.js"></script>
<script type="text/javascript"
        src="//f1.yihuimg.com/concat/cross_pc/1.1.1/widget/nicescroll/3.6.0/js/nicescroll.min.js"></script>
<link rel="stylesheet" href="//f1.yihuimg.com/concat/cross_pc/1.1.1/widget/lxslider/1.0/css/lxslider.min.css"
      type="text/css"/>
<script type="text/javascript"
        src="//f1.yihuimg.com/concat/cross_pc/1.1.1/widget/lxslider/1.0/js/lxslider.min.js"></script>
<script type="text/javascript" src="/js/login/jq.cookie.js"></script>
<script type="text/javascript" src="/js/common/cookieoperation.js"></script>
<script type="text/javascript" src="/js/login/md5.js"></script>
<script type="text/javascript" src="/js/login/register.js?v=1"></script>

</body>
</html>
