package collection_task;

public class CustomSession {
	private String name;
	private String preference;
	private String status;

	public CustomSession(String name, String preference,String status) {
		this.setName(name);
		this.setPreference(preference);
		this.setStatus(status);
	}
	public String toString() {
        return "Name: " + name + ", Preference: " + preference +", Status: "+status;
    }

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
