package coforgespringexamples;

import java.util.*;

public class Tutor {
	String name;
	int experience;
	List<String> languages;
	Set<String> degrees;
	Map<String, String> countries;
	public Tutor() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public Set<String> getDegrees() {
		return degrees;
	}
	public void setDegrees(Set<String> degrees) {
		this.degrees = degrees;
	}
	public Map<String, String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	public Tutor(String name, int experience, List<String> languages, Set<String> degrees,
			Map<String, String> countries) {
		super();
		this.name = name;
		this.experience = experience;
		this.languages = languages;
		this.degrees = degrees;
		this.countries = countries;
	}
	@Override
	public String toString() {
		return "Tutor [name=" + name + ", experience=" + experience + ", languages=" + languages + ", degrees="
				+ degrees + ", countries=" + countries + "]";
	}
}
