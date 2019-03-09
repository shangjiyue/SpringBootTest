package com.shang.team.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author sjy
 * @since 2019-02-28
 */
@TableName("sys_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String name;
	private String age;
	private Integer roleid;


	public Integer getId() {
		return id;
	}

	public User setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public String getAge() {
		return age;
	}

	public User setAge(String age) {
		this.age = age;
		return this;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public User setRoleid(Integer roleid) {
		this.roleid = roleid;
		return this;
	}

	public static final String ID = "id";

	public static final String NAME = "name";

	public static final String AGE = "age";

	public static final String ROLEID = "roleid";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "User{" +
			", id=" + id +
			", name=" + name +
			", age=" + age +
			", roleid=" + roleid +
			"}";
	}
}
