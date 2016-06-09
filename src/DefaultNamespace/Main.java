/**
 * Main.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface Main extends java.rmi.Remote {
    public void updateCategory(java.lang.String oldCategoryName, java.lang.String newCategoryName) throws java.rmi.RemoteException;
    public void addCategory(java.lang.String categoryName) throws java.rmi.RemoteException;
    public void modifyAd(int yearBook, java.lang.String oldAdName, java.lang.String oldStreet, java.lang.String oldTown, java.lang.String oldPostCode, java.lang.String oldCategory, java.lang.String newAdName, java.lang.String newPhone, java.lang.String newStreet, java.lang.String newTown, java.lang.String newPostCode, java.lang.String newCategory) throws java.rmi.RemoteException;
    public void dropCategory(java.lang.String category) throws java.rmi.RemoteException;
    public void dropAd(int yearBook, java.lang.String adName) throws java.rmi.RemoteException;
    public java.lang.String getAdsNames(int yearBook) throws java.rmi.RemoteException;
    public java.lang.String getYearBook(int yearBook) throws java.rmi.RemoteException;
    public java.lang.String getAd(int yearBook, java.lang.String adName) throws java.rmi.RemoteException;
    public void addAd(int yearBook, java.lang.String adName, java.lang.String phone, java.lang.String street, java.lang.String town, java.lang.String postCode, java.lang.String category) throws java.rmi.RemoteException;
}