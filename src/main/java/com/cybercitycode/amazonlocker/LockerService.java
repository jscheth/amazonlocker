
public interface LockerService {

    String getCode(UUID lockerId);

    void generateCode(Locker locker);

    void unassignLocker(Locker locker, Package package);

    void assignLocker(Locker locker, Package package, String code);

    Locker findOptimalLocker(Package package, User user);

}