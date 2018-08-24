package com.abhijeet.project;

import java.io.Serializable;

import javax.persistence.*;

@Table(name="megatab")  
@Entity
public class SchemaDefination implements Serializable{

	@Id @GeneratedValue
	@Column(name = "ID")
	private Long ID;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "middle_name")
	private String middle_name;
	
	@Column(name = "days")
	private String days;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "nickname")
	private String nickname;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "car")
	private String car;
	
	@Column(name = "morpho")
	private String morpho;
	
	@Column(name = "pelo")
	private String pelo;
	
	@Column(name = "vest_sup")
	private String vest_sup;
	
	@Column(name = "color_sup")
	private String color_sup;
	
	@Column(name = "vest")
	private String vest;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "coche_aux")
	private String coche_aux;
	
	@Column(name = "weapon")
	private String weapon;
	
	@Column(name = "name_all")
	private String name_all;
	
	@Column(name = "age")
	private Long age;
	
	@Column(name = "height")
	private Long height;
	
	@Column(name = "pages")
	private Long pages;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getMorpho() {
		return morpho;
	}
	public void setMorpho(String morpho) {
		this.morpho = morpho;
	}
	public String getPelo() {
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	public String getVest_sup() {
		return vest_sup;
	}
	public void setVest_sup(String vest_sup) {
		this.vest_sup = vest_sup;
	}
	public String getColor_sup() {
		return color_sup;
	}
	public void setColor_sup(String color_sup) {
		this.color_sup = color_sup;
	}
	public String getVest() {
		return vest;
	}
	public void setVest(String vest) {
		this.vest = vest;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCoche_aux() {
		return coche_aux;
	}
	public void setCoche_aux(String coche_aux) {
		this.coche_aux = coche_aux;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getName_all() {
		return name_all;
	}
	public void setName_all(String name_all) {
		this.name_all = name_all;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Long getHeight() {
		return height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}
	public Long getPages() {
		return pages;
	}
	public void setPages(Long pages) {
		this.pages = pages;
	}
}
