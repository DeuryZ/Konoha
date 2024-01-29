/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.konoha.DAO;

/**
 *
 * @author user
 */
public interface IGetByIdDAO<T> extends IDAO{
    T getById(long id);
}
