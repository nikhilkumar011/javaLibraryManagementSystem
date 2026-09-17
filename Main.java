import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Library library=new Library();

        while(true){
            System.out.println("\n1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Show Books");
            System.out.println("4. Show Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookId=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter title: ");
                    String title=sc.nextLine();

                    System.out.print("Enter author: ");
                    String author=sc.nextLine();

                    library.addBook(new Book(bookId,title,author));
                    break;

                case 2:
                    System.out.print("Enter user ID: ");
                    int userId=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter user name: ");
                    String name=sc.nextLine();

                    library.addUser(new User(userId,name));
                    break;

                case 3:
                    library.showBooks();
                    break;

                case 4:
                    library.showUsers();
                    break;

                case 5:
                    System.out.print("Enter book ID: ");
                    bookId=sc.nextInt();

                    System.out.print("Enter user ID: ");
                    userId=sc.nextInt();

                    library.issueBook(bookId,userId);
                    break;

                case 6:
                    System.out.print("Enter book ID: ");
                    bookId=sc.nextInt();

                    library.returnBook(bookId);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}