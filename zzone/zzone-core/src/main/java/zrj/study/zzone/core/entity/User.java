package zrj.study.zzone.core.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author zhongrj
 * @email 329053269@qq.com
 * @date 2017/4/19
 */
public class User extends BaseEntity {

    @NotEmpty(message = "用户名不能为空")
    private String account;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 5, message = "密码长度不能小于5位")
    private String password;

    private String name;

    private String type;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}