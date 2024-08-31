class Book {
    public Book(String bookName, int bookId) {
        this.bookName = bookName;
        this.bookId = bookId;
    }

    private String bookName;
    private int bookId;

    public String getBookName() {
        return bookName;
    }

    public int getBookId() {
        return bookId;
    }
}

class Member {
    private String memberName;
    private int memberId;

    public Member(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberId() {
        return memberId;
    }
}

class LoanService {
    public void loanBook(Book book, Member member) {
        System.out.print("Book: " + book.getBookId() + " " + book.getBookName());
        System.out.println("Member: " + member.getMemberId() + " " + member.getMemberName());
    }
}

public class SrpPrincipleRealWorldExample {
    public static void main(String[] args) {
        Member member = new Member("madhavan", 2532);
        Book book = new Book("Java", 112);
        LoanService loanService = new LoanService();
        loanService.loanBook(book, member);
    }

}
