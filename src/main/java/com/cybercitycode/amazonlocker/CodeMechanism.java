
public class CodeMechanism {
    private UUID id;
    private UUID lockerId;
    private String code;
    private LocalDateTime createDate;

    public CodeMechanism(UUID lockerId, String code, LocalDateTime createDate) {
        this.lockerId = lockerId;
        this.code = code;
        this.createDate = createDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getLockerId() {
        return lockerId;
    }

    public void setLockerId(UUID lockerId) {
        this.lockerId = lockerId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}