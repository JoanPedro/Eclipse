package br.com.joanpedro.pattern.builder;

public class Person {
	private String name;
	private String email;
	private String address;
	private int age;
	private String university;
	
	public Person(Builder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.address = builder.address;
		this.age = builder.age;
		this.university = builder.university;
	}
	
	public static class Builder {
		private final String name;
		private final String email;
		private String address;
		private int age;
		private String university;
		
		public Builder(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public String getAddress() {
			return this.address;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public int getAge() {
			return age;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder setUniversity(String university) {
			this.university = university;
			return this;
		}
		
 		public Person build() {
			return new Person(this);
		}
	}
	
	public String toString() {
		return this.name + '-' + this.email + '-' + this.address + '-' + this.age + '-' + this.university;
	}
}
