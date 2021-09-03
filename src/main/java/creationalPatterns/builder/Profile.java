package creationalPatterns.builder;

public class Profile {
    private final Long id;
    private final String username;
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;

    private Profile(ProfileBuilder profileBuilder) {
        this.id = profileBuilder.getId();
        this.username = profileBuilder.getUsername();
        this.name = profileBuilder.getName();
        this.surname = profileBuilder.getSurname();
        this.address = profileBuilder.getAddress();
        this.phone = profileBuilder.getPhone();
    }


    public static class ProfileBuilder{
        private final Long id;
        private String username;
        private String name;
        private String surname;
        private String address;
        private String phone;

        public ProfileBuilder(Long id){
            this.id = id;
        }

        public ProfileBuilder setUsername(String username){
            this.username = username;
            return this;
        }

        public ProfileBuilder setName(String name){
            this.name = name;
            return this;
        }

        public ProfileBuilder setSurname(String surname){
           this.surname = surname;
            return this;
        }

        public ProfileBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public ProfileBuilder setPhone(String phone){
            this.phone = phone;
            return this;
        }

        public Long getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getAddress() {
            return address;
        }

        public String getPhone() {
            return phone;
        }

        public Profile build(){
            return new Profile(this);
        }
    }
}
