import java.io.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.sql.*;
import java.awt.Desktop;

class PDFDemo_Database {
    public static void main(String[] args) {
        myclass obj = new myclass();
        obj.create_pdf();
        obj.write_heading();
        obj.create_tab_heading();
        obj.add_rows();
        obj.close_pdf();
    }
}

class myclass {
    String path;
    OutputStream file;
    Document document;
    Paragraph p;

    PdfPTable table;
    PdfPCell c1;
    Font big, small;

    int cnt;

    myclass() {
        big = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        small = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

        try {
            cn = DriverManager.getConnection("jdbc:mysql:///tejas", "root", "root");
            stm = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (Exception e) {
            System.out.println(e);
        }

        path = "Test.pdf";
        file = null;
        document = null;
    }

    void create_pdf() {
        try {
            file = new FileOutputStream(new File(path));
            document = new Document();
            PdfWriter.getInstance(document, file);
            document.open();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void write_heading() {
        try {
            p = new Paragraph("ANEKANT ENGLISH MEDIUM SCHOOL,BARAMATI", big);
            p.setAlignment(Element.ALIGN_CENTER);
            document.add(p);
            document.add(new Paragraph(" "));

            p = new Paragraph("Date = " + new java.util.Date());
            p.setAlignment(Element.ALIGN_RIGHT);
            document.add(p);
            document.add(new Paragraph(" "));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void create_tab_heading() {
        float[] colsWidth = { 20, 20, 40 };
        table = new PdfPTable(colsWidth);
        table.setWidthPercentage(80);

        c1 = new PdfPCell(new Phrase("Sr No", small));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Roll No", small));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Name", small));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        table.setHeaderRows(1);
    }

    void add_rows() {
        cnt = 0;
        try {
            rs = stm.executeQuery("select * from leavemaster");
            while (rs.next()) {
                cnt++;

                c1 = new PdfPCell(new Phrase(Integer.toString(cnt)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);

                c1 = new PdfPCell(new Phrase(rs.getString(1)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);

                table.addCell(rs.getString(2));
            }
            rs.close();
            cn.close();

            PdfPCell cell = new PdfPCell(new Paragraph("Total No. of Stud = " + cnt));
            cell.setColspan(2);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            document.add(table);
            document.add(new Paragraph(" "));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void close_pdf() {
        try {
            if (document != null) {
                document.close();
            }
            if (file != null) {
                file.close();
            }

            // To open the pdf file in Linux & Windows
            Desktop desktop = Desktop.getDesktop();
            desktop.open(new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
