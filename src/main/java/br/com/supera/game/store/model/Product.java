package br.com.supera.game.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

   @Id
   @GeneratedValue
   public long id;

   public String name;

   public BigDecimal price;

   public short score;

   public String image;

}