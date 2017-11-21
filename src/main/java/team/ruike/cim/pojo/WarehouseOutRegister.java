package team.ruike.cim.pojo;


import java.util.Date;

public class WarehouseOutRegister {

  private Integer warehouseOutRegisterId;
  private Date warehouseOutRegisterEndDate;
  private Integer userId;
  private Integer status;


  public Integer getWarehouseOutRegisterId() {
    return warehouseOutRegisterId;
  }

  public void setWarehouseOutRegisterId(Integer warehouseOutRegisterId) {
    this.warehouseOutRegisterId = warehouseOutRegisterId;
  }


  public Date getWarehouseOutRegisterEndDate() {
    return warehouseOutRegisterEndDate;
  }

  public void setWarehouseOutRegisterEndDate(Date warehouseOutRegisterEndDate) {
    this.warehouseOutRegisterEndDate = warehouseOutRegisterEndDate;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}
