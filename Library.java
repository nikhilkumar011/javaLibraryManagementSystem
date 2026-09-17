import java.util.ArrayList;

public class Library{
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library(){
        books=new ArrayList<>();
        users=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void addUser(User user){
        users.add(user);
        System.out.println("User added successfully.");
    }

    public void showBooks(){
        if(books.isEmpty()){
            System.out.println("No books available.");
            return;
        }

        for(Book book:books){
            book.display();
        }
    }

    public void showUsers(){
        if(users.isEmpty()){
            System.out.println("No users registered.");
            return;
        }

        for(User user:users){
            System.out.println("ID: "+user.getId()+" | Name: "+user.getName());
        }
    }

    public void issueBook(int bookId,int userId){
        Book book=findBook(bookId);
        User user=findUser(userId);

        if(book==null){
            System.out.println("Book not found.");
            return;
        }

        if(user==null){
            System.out.println("User not found.");
            return;
        }

        if(!book.isAvailable()){
            System.out.println("Book is already issued.");
            return;
        }

        book.setAvailable(false);
        System.out.println("Book issued to "+user.getName()+".");
    }

    public void returnBook(int bookId){
        Book book=findBook(bookId);

        if(book==null){
            System.out.println("Book not found.");
            return;
        }

        if(book.isAvailable()){
            System.out.println("Book is already in the library.");
            return;
        }

        book.setAvailable(true);
        System.out.println("Book returned successfully.");
    }

    private Book findBook(int id){
        for(Book book:books){
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }

    private User findUser(int id){
        for(User user:users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }
}