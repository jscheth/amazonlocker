
public class LockerServiceImpl implements LockerService {

    public static final Map<UUID, String> codeMap = new HashMap<>();
    public static final List<CodeMechanism> codes = new ArrayList<>();
    public static final Map<UUID, Package> packageMap = new HashMap<>();
    public static final List<Locker> lockers = new ArrayList<>();

    @Override
    String getCode(UUID lockerId) {
        return codeMap.get(lockerId);
    };

    @Override
    String generateCode(Locker locker) {
        String code = this.getRandomDigits();
        CodeMechanism codeMechanism = new CodeMechanism(locker.getId(), code, LocalDateTime.now());
        codes.add(codeMechanism);

        return code;
    };

    @Override
    void unassignLocker(Locker locker, Package package) {
        codeMap.remove(locker.getId());
        packageMap.remove(locker.getId());
        locker.setStatus(Status.AVAILABLE);
    };

    @Override
    void assignLocker(Locker locker, Package package, String code) {
        codeMap.put(locker.getId(), code);

        packageMap.put(locker.getId(), package);

        locker.setStatus(Status.RESERVED);


    };

    @Override
    Locker findOptimalLocker(Package package, User user) {
        //Use geo location service, compare user location and available lockers
    };

    private String getRandomDigits() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

}