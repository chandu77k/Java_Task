package collection_task;

public class CustomSession {
    private String name;
    private String preference;
    private String status;

    /**
     * Constructor to initialize a CustomSession object.
     *
     * @param name The name of the user
     * @param preference The preference for the session.
     * @param status The status of the session
     */
    public CustomSession(String name, String preference, String status) {
        this.setName(name);
        this.setPreference(preference);
        this.setStatus(status);
    }

    /**
     * @return a string containing the name, preference, and status
     */
    public String toString() {
        return "Name: " + name + ", Preference: " + preference + ", Status: " + status;
    }

    /**
     * Sets the user's preference
     *
     * @param preference The preference to be set.
     */
    public void setPreference(String preference) {
        this.preference = preference;
    }

    /**
     * Sets the name of the user
     *
     * @param name The name to be set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the status
     *
     * @param status The status to be set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
