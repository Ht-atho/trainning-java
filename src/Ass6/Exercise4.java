package Ass6;

class Author {
    private final String name;
    private String email;
    private final char gender;   // 'm' or 'f'
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Author[name = "+ name+",email = "+email+",gender = "+gender +"]";
    }
    public static void testAuthor(){
        Author author = new Author("Thanh", "thanh@gmail.com", 'f');
        System.out.println(author);
        author.setEmail("thanhCheck@somewhere.com");
        System.out.println(author);
        System.out.println("name is: " + author.getName());
        System.out.println("gender is: " + author.getGender());
        System.out.println("email is: " + author.getEmail());
    }
    public static void main(String[] args) {
        testAuthor();
    }


}