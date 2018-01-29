package cn.cat.springmvc.demo.pojo;



import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user")
public class User  implements Serializable{
    private static final long serialVersionUID = 1911539221355857494L;
    @Id
    private Integer id;

    private String name;

    private String username;

    private Byte status;

    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", status=" + status +
                ", password='" + password + '\'' +
                '}';
    }
}