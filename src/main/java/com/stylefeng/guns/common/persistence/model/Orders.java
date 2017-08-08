package com.stylefeng.guns.common.persistence.model;

import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author dingrc
 * @since 2017-07-28
 */
public class Orders extends Model<Orders> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String name;
	@TableField("create_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;
	private String avatar;


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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Orders{" +
			"id=" + id +
			", name=" + name +
			", createAt=" + createAt +
			", avatar=" + avatar +
			"}";
	}
}
