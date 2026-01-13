public class ServicePerson {
    private final Save dataBase;
    public ServicePerson(Save repository) {
        this.dataBase = repository;
    }
    public void savePerson(Person person) {
        dataBase.savePerson(person);
    }

}