package com.sojson.core.shiro.token;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 开发公司：SOJSON在线工具 <p>
 * 版权所有：© www.sojson.com<p>
 * 博客地址：http://www.sojson.com/blog/  <p>
 * Shiro token
 * 区分　责任人　日期　　　　说明<br/>
 * 创建　周柏成　2016年6月2日 　<br/>
 *
 * @author zhou-baicheng
 * @version 1.0, 2016年6月2日 <br/>
 * @email so@sojson.com
 */
public class ShiroToken extends UsernamePasswordToken implements java.io.Serializable
{

    private static final long serialVersionUID = -6451794657814516274L;
    /**
     * 登录密码[字符串类型] 因为父类是char[] ]
     **/
    private String pswd;

    public ShiroToken(String username, String pswd)
    {
        super(username, pswd);
        this.pswd = pswd;
    }

    public String getPswd()
    {
        return pswd;
    }

    public void setPswd(String pswd)
    {
        this.pswd = pswd;
    }

}
