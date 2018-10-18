function register(){
    $.ajax({
        url : "/login/register",
        type : 'POST',
        dataType : "json",
        data : {
            userName : "demo2",
            userLoginName : "demo2",
            userIdentityType : "1",
            userStatus : "1",
            userPassword:"123456"
        },
        success : function(data) {
            if (data) {}
        },
        error : function() {
            showMessage("登录失败");
        }
    });
}