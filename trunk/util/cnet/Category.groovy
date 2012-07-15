/*
 * Copyright 2009 Igor Azarnyi, Denys Pavlov
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */





package com.npa.cnetxml
/**
 * User: Gordon.Freeman (A) gordon-minus-freeman@ukr.net
 * Date: 9 серп 2010
 * Time: 16:51:30
 */

public class Category {

  private static int rootId = 100;

  long id;

  long parentId;

  String name;

  String description;

  List<Category> subCategories;

  List<Product> products;

  def Category(final id) {
    this.id = id;
    this.subCategories = new ArrayList<Category>();
    this.products = new ArrayList<Product>();
  }

  def Category() {
    this.id = rootId;
    this.subCategories = new ArrayList<Category>();
    this.products = new ArrayList<Product>();
  }


  String getProdXml() {
    if (rootId == id) {
      return null;
    }
    return "prod-" + id + ".xml";
  }


  String toString() {
    return "Category {" +
            "id=" + id + " name=" + name +
            "\n subCategories=" + subCategories +
            '}';
  }






}