package team.ruike.cim.pojo;


import java.io.Serializable;
/**
 成品库出库登记表项类
 * @author 王傲祥
 * @version 1.0
 */
public class ProductWarehouseOutRegisterItem implements Serializable {

  private static final long serialVersionUID = -6274426992693661592L;
  /**
   *成品库出库登记表项ID
   */
  private Integer productWarehouseOutRegisterItemId;
  /**
   * 菜品ID外键
   */
  private Integer menuId;
  /**
   * 货架ID
   */
  private Integer productGoodsShelveId;
  /**
   * 出库数量
   */
  private Integer menuNumber;
  /**
   * 成品出口登记表外键
   */
  private Integer productWarehouseOutRegisterId;
  /**
   * 删除状态
   */
  private Integer status;


  public Integer getProductWarehouseOutRegisterItemId() {
    return productWarehouseOutRegisterItemId;
  }

  public void setProductWarehouseOutRegisterItemId(Integer productWarehouseOutRegisterItemId) {
    this.productWarehouseOutRegisterItemId = productWarehouseOutRegisterItemId;
  }


  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }


  public Integer getProductGoodsShelveId() {
    return productGoodsShelveId;
  }

  public void setProductGoodsShelveId(Integer productGoodsShelveId) {
    this.productGoodsShelveId = productGoodsShelveId;
  }


  public Integer getMenuNumber() {
    return menuNumber;
  }

  public void setMenuNumber(Integer menuNumber) {
    this.menuNumber = menuNumber;
  }


  public Integer getProductWarehouseOutRegisterId() {
    return productWarehouseOutRegisterId;
  }

  public void setProductWarehouseOutRegisterId(Integer productWarehouseOutRegisterId) {
    this.productWarehouseOutRegisterId = productWarehouseOutRegisterId;
  }


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}
