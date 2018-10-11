var cookieOperation={};
/**
 * 写cookie根目录
 * @param cookiename
 * @param cookievalue
 * @param expires
 */
cookieOperation.writerootcookie = function(cookiename,cookievalue,expires){
    $.cookie(cookiename, cookievalue, { expires: expires, path: '/' });
};
/**
 * 写当前页面的cookie
 * @param cookiename
 * @param cookievalue
 * @param expires
 */
cookieOperation.writecookie = function(cookiename,cookievalue,expires){
    $.cookie(cookiename, cookievalue, { expires: expires });
};
/**
 * 读cookie值
 * 有值返回值，无值返回null
 * @param cookiename
 */
cookieOperation.readcookie = function(cookiename){
    return $.cookie(cookiename);
};
/**
 * 清除cookie
 * @param cookiename
 */
cookieOperation.clearcookie = function(cookiename){
    $.cookie(cookiename, null);
};