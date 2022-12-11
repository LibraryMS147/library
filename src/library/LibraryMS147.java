package library;
import java.util.Scanner;
import java.util.Date;

        public class LibraryMS147
        {
            public static void main(String[] args)
            {
                Book[] books =
                        {
                                new Book("To Kill a Mockingbird"),
                                new Book("Night"),
                                new Book("Fahrenheit 451")
                        };

                Scanner scanner = new Scanner(System.in);

                System.out.println("Are you here to check out a book? (y/n)");
                String checkout = scanner.next();
                while (checkout.equals("y")) {
                    System.out.println("pick one:");

                    for (int i = 0; i < books.length; i++) {
                        System.out.println(i + 0 + ". " + books[i].getTitle());
                    }

                    System.out.println("Enter number of book desired");

                    int bookNumber = scanner.nextInt();
                    System.out.println(books[bookNumber].getTitle());


                    System.out.println("What kind of book would you like? Enter 1 for Digital Enter 2 for Physical"  );
                    int type = scanner.nextInt();
                    switch (type){
                        case 1:
                            DigitalBook digitalBook = new DigitalBook(books[bookNumber].getTitle());
                            digitalBook.setCheckoutDate(new Date());
                            System.out.println("Digital ");
                            System.out.println(digitalBook.getTitle());
                            break;
                        case 2:
                            System.out.println("Physical");
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    System.out.println("Do you currently have any books checked out? (y/n)");
                    String history = scanner.next();

                    if (history.equals("y")) {
                        System.out.println("How many days has it been since your last checkout?");

                        int numDays = scanner.nextInt();

                        if (numDays > 7) {
                            System.out.println("Sorry, you'll have to pay a fine, we'll issue it onto your next order, but enjoy your book!");

                        }

                    } else {
                        books[bookNumber].setCheckoutDate(new Date());
                        System.out.println("Okay, Enjoy your book! "+ books[bookNumber].getTitle());

                    }
                    System.out.println("Are you here to check out a book? (y/n)");
                    checkout = scanner.next();
                }
                System.out.println("No book selected");
            }
        }

