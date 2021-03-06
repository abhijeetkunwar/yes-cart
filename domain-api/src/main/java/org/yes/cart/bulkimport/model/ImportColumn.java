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

package org.yes.cart.bulkimport.model;

import java.util.List;

/**
 * Single import line description.
 * <p/>
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 08-May-2011
 * Time: 11:12:54
 */
public interface ImportColumn {

    /**
     * Get the field value. Regular expression will be used for obtain value if reg exp is set.
     *
     * @param rawValue the whole value from cell
     * @param adapter value adapter
     * @return value
     */
    Object getValue(String rawValue, ValueAdapter adapter);


    /**
     * Get the field value as string array via reg exp.
     *
     * @param rawValue the whole value from cell
     * @param adapter value adapter
     * @return field value as string array
     */
    List getValues(String rawValue, ValueAdapter adapter);


    /**
     * Is sub import field shall be treated as table. The | used for row delimiter
     * @return  true in case if  perform import as table subimport
     */
    boolean isTable();

    /**
     * Set table sub import flag .
     * @param table table sub  import flag.
     */
    void setTable(boolean table);


    /**
     * In case if column has reg exp.
     *
     * @param rawValue the whole value from cell
     * @return matched groups or 0 if column has not reg exp.
     */
    int getGroupCount(String rawValue);

    /**
     * Column index from csv file, 1 based
     *
     * @return column index
     */
    int getColumnIndex();

    /**
     * Set column index.
     *
     * @param columnIndex column index
     */
    void setColumnIndex(int columnIndex);

    /**
     * Get the {@link FieldTypeEnum}.
     *
     * @return filed type
     */
    FieldTypeEnum getFieldType();

    /**
     * Set the {@link FieldTypeEnum}
     *
     * @param fieldType to set.
     */
    void setFieldType(FieldTypeEnum fieldType);

    /**
     * Get the {@link DataTypeEnum}.
     *
     * @return data type (used for converting data correctly)
     */
    DataTypeEnum getDataType();

    /**
     * Set the {@link DataTypeEnum}
     *
     * @param dataType to set.
     */
    void setDataType(DataTypeEnum dataType);

    /**
     * Field name in object in java beans notation.
     *
     * @return field name.
     */
    String getName();

    /**
     * Set the field name.
     *
     * @param name field name.
     */
    void setName(String name);

    /**
     * Regular expression for get value for specified field name
     * in case if csv field contains more than one object field.
     * Example:  gold,855
     *
     * @return regular expression to get the value from csv field
     */
    String getValueRegEx();

    /**
     * Set optional regexp to get the value from csv field.
     *
     * @param regExp regular expression.
     */
    void setValueRegEx(String regExp);

    /**
     * @return group that defines the value in regex specified
     */
    Integer getValueRegExGroup();

    /**
     * @param valueRegExGroup group that defines the value in regex specified
     */
    void setValueRegExGroup(Integer valueRegExGroup);


    /**
     * Get the HQL lookup query to get the foreign key object within csv filed value
     * or value from csv gathered via regexp.
     *
     * @return HQL lookup query.
     */
    String getLookupQuery();

    /**
     * Set the HQL query.
     *
     * @param lookupQuery HQL query.
     */
    void setLookupQuery(String lookupQuery);


    /**
     * Get included import descriptor for complex fields.
     *
     * @return {@link ImportDescriptor}
     */
    ImportDescriptor getImportDescriptor();


    /**
     * Set included import descriptor for complex fields.
     *
     * @param importDescriptor {@link ImportDescriptor}
     */
    void setImportDescriptor(ImportDescriptor importDescriptor);

    /**
     * Boolean flag needed to use master object for fk in case of subimport.
     *
     * @return true if need to use master object.
     */
    boolean isUseMasterObject();

    /**
     * Set use master object in case of fk subimport.
     *
     * @param useMasterObject use master object flag.
     */
    void setUseMasterObject(boolean useMasterObject);

    /**
     * Get the constant for field. Some fields can be field with constants
     *
     * @return filed constant
     */
    String getValueConstant();

    /**
     * Set the constants
     *
     * @param constant string constant
     */
    void setValueConstant(String constant);

    /**
     * @return entity type for FK's
     */
    String getEntityType();

    /**
     * @param entityType entity type for FK's
     */
    void setEntityType(String entityType);

    /**
     * @return language of the localisable value (or null if this is not localisable)
     */
    String getLanguage();

    /**
     * @param language language of the localisable value (or null if this is not localisable)
     */
    void setLanguage(String language);
}
