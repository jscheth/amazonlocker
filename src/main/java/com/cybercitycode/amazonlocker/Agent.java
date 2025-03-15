
public class Agent {
    private UUID id;
    private String name;
    private String email;
    private Map<Locker, Package> deliverMap = new HashMap<>();
    private String masterKey;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<Locker, Package> getDeliverMap() {
        return deliverMap;
    }

    public void setDeliverMap(Map<Locker, Package> deliverMap) {
        this.deliverMap = deliverMap;
    }

    public String getMasterKey() {
        return masterKey;
    }

    public void setMasterKey(String masterKey) {
        this.masterKey = masterKey;
    }
}