package com.eliteams.quick4j.web.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户模型
 * 
 * @author StarZou
 * @since 2014年7月5日 下午12:07:20
 **/
public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8702119654447779184L;

	private Long id;

    private String username;

    private String password;

    private String state;

    private Date createTime;
    
    private String task_state;
    

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public User(Long id, String username, String password, String state,
			Date createTime, String task_state) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.state = state;
		this.createTime = createTime;
		this.task_state = task_state;
	}

	public String getTask_state() {
		return task_state;
	}

	public void setTask_state(String task_state) {
		this.task_state = task_state;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", state=" + state + ", createTime=" + createTime
				+ ", task_state=" + task_state + "]";
	}

	
	

}