# Apple Store – Feature Description


## 1. Product

String id:                                              //Mã định danh duy nhất
String name:                                            //Tên sản phẩm (ví dụ: "iPhone 15 Pro Max").
double price:                                           //Giá bán hiện tại.
int quantity:                                           //Số lượng tồn kho thực tế.
String description:                                     //Mô tả chi tiết kỹ thuật.
String categoryId:                                      //Liên kết với danh mục sản phẩm.


- calculateDiscountedPrice(double percentage):          //Giá sau khi giảm.(theo %)
- isStockAvailable():                                   //Sản phẩm còn hàng không.
- getInfo()                                             //Lấy thông tin sp

## 2. Category (danh mục)

String categoryId:                                      //Mã danh mục
String categoryName:                                    //Tên danh mục 
String location:                                        //Khu vực trưng bày trong kho hoặc cửa hàng.


- displayInfo():                                        //thông tin chi tiết danh mục or nhà cung cấp
- setLocation(String location):                         //Vị trí shop còn hàng

## 3. ProductManager

List<Product> productList:                              //Danh sách tập trung toàn bộ sản phẩm để xử lý CRUD.
int totalProducts:                                      //Biến đếm tổng số lượng chủng loại sản phẩm hiện có.

- addProduct(Product p):                                //them sp.
- updateProduct(String id, Product newInfo):            //cap nhat thong tin theo ID.
- deleteProduct(String id):                             //xoa sp.
- getAllProducts():                                     //tra ve danh sach tat ca sp.


## 4. CategoryManager (quan ly danh muc)

Map<String, Category> categories:                       //Sử dụng Map để truy xuất danh mục nhanh hơn qua ID.
List<String> validCategoryNames:                        //Danh sách tên danh mục được phép sử dụng.


- addCategory(Category c):                              //them danh muc moi.
- getProductsByCategory(String categoryId):             //Lay tat ca sp thuoc 1 danh muc.
- getAllCategories():                                   //Tra toan bo map

## 5. Inventory (kho hang)

Map<String, Integer> stockLevels:                       //Lưu trữ cặp Mã sản phẩm - Số lượng để kiểm tra nhanh.
int lowStockThreshold:                                  //Ngưỡng cảnh báo hết hàng (dưới 10 sản phẩm là báo động).


- updateQuantity(String productId, int amount):         //Tang giam so luong ton kho.
- getLowStockProducts(int threshold):                   //liet ke sp sap het hang

## 6. StockTransaction (giao dich kho)

String transactionId:                                   //Mã giao dịch duy nhất.
String productId:                                       //Sản phẩm nào đang được xuất/nhập.
String type:                                            //Loại giao dịch ("IN" cho nhập kho, "OUT" cho xuất kho).
int quantityChange:                                     //Số lượng biến động.
String timestamp:                                       //Thời gian chính xác diễn ra giao dịch.


- recordTransaction(String type, int qty):              //Lưu lại vết nhập/xuất kho.
- generateReport(Date reportDate):                      //Xuất báo cáo giao dịch theo ngày.

## 7. SearchService (dich vu tim kiem)

List<Product> lastSearchResults:                        //Lưu lại kết quả của lần tìm kiếm/lọc gần nhất.


- searchByName(String name):                            //Tìm kiếm gần đúng theo tên.
- searchById(String id):                                //Tìm kiếm chính xác theo mã.

## 8. FilterService (bo loc)

- filterByPriceRange(double min, double max):           //Lọc sản phẩm trong tầm giá.
- filterByStatus(boolean inStock):                      //Lọc theo trạng thái còn hàng/hết hàng.

## 9. PriceManager (quan ly gia)

double taxRate:                                         //Thuế VAT áp dụng cho giá sản phẩm (thường là 10% tại VN).
String currency:                                        //Đơn vị tiền tệ (VNĐ, USD).


- applyMassPriceUpdate(double ratio):                   //Cập nhật giá đồng loạt (tăng 10% toàn bộ).
- setPromotionalPrice(String id, double promoPrice):    //Thiết lập giá khuyến mãi tạm thời.

## 10. SystemManager (quan ly he thong)

String version:                                         //Phiên bản phần mềm (ví dụ: "v1.0.2").
boolean isDataLoaded:                                   //Trạng thái kiểm tra dữ liệu đã được tải lên từ file chưa.


- displayMainMenu():                                    //Hiển thị danh sách các tùy chọn chính (Quản lý kho, Tìm kiếm, Báo cáo...).
- handleUserChoice(int choice):                         //Tiếp nhận lựa chọn từ bàn phím và gọi các hàm tương ứng từ ProductManager hoặc Inventory.
- initSystem():                                         //Khởi tạo hệ thống.
- exitSystem():                                         //Thực hiện các thủ tục đóng chương trình (hỏi người dùng có muốn lưu trước khi thoát không và free memmory).
- showSystemStatus():                                   //Hiển thị thông tin tổng quan về hệ thống (phiên bản, dung lượng dữ liệu hiện có, trạng thái kết nối tệp).
