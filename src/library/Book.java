package library;


import java.util.Date;

public class Book {
        //static class Book
        public static void main(String[] args){

        }

        private String title;
            private Date checkoutDate;
            Book(String bookTitle)
            {
                title = bookTitle;
            }

            public void setCheckoutDate(Date date)
            {
                checkoutDate = date;
            }

            public String getTitle()
            {
                return title;
            }
        }



