package sevice;

import model.Product;

import java.awt.print.Book;
import java.util.List;
public interface IProductService {
    //    Hiển thị danh sách sản phẩm
//    Tạo sản phẩm mới
//    Cập nhật thông tin sản phẩm
//    Xoá một sản phẩm
//    Xem chi tiết một sản phẩm
//    Tìm kiếm sản phẩm theo tên
    public List<Product> findAll();
    public Book findBy(String name);
    public boolean add(Product book);

}
