// IndexHeader.java

package com.timeindexing.index;

import com.timeindexing.time.Timestamp;
import com.timeindexing.basic.ID;

/**
 * An index header.
 * This is the generic interface to an index header.
 */
public interface IndexHeader {
    /**
     * The name of the index.
     */
    public String getName();

    /**
     * Get an ID of an index.
     */
    public ID getID();

     /**
      * Get the start time of the index.
      * This is when the index was created not necessarliy when the first item
      * was added to the index.
      */
     public Timestamp getStartTime();

     /**
      * Get the end time of the index.
      * This is the time the last item was closed, not necessarliy when the last item
      * was added to the index.
      */
     public Timestamp getEndTime();

    /**
     * Get the time the first IndexItem was put into the Index.
     */
    public Timestamp getFirstTime();

    /**
     * Get the time the last IndexItem was put into the Index.
     */
    public Timestamp getLastTime();

    /**
     * Get the data time for the first IndexItem in the Index.
     */
    public Timestamp getFirstDataTime();

    /**
     * Get the data time for the last IndexItem in the Index.
     */
    public Timestamp getLastDataTime();

    /**
     * Does the index have fixed size data.
     */
    public boolean isFixedSizeData() ;

    /**
     * Get the size of the data items, if there is fixed size data.
     * The value -1 means variable sized data.
     */
    public long getDataSize();

    /**
     * Get the no of items in the index.
     */
    public long getLength();

    /**
     * Get the  style of the index.
     * Either inline or external or shadow.
     */
    public int getIndexType();

    /**
     * Get the data type of the index.
     * Some indexes have the same type throughout,
     * other have mixed type data.
     */
    public DataType getIndexDataType();

    /**
     * Get the path of the index.
     * @return null if there is no index path
     */
    public String getIndexPathName();

    /**
     * Get the path of the data if the index data style
     * is external or shadow.
     * @return null if there is no data path
     */
    public String getDataPathName();

    /**
     * Get the description for an index.
     * @return null if there is no description
     */
    public Description getDescription();

    /**
     * Set the description.
     * This is one of the few attributes of an index that can be set directly.
     */
    public IndexHeader setDescription(Description description);

    /**
     * Is the Index terminated.
     */
    public boolean isTerminated();

    /**
     * Is the index still in time order.
     */
    public boolean isInTimeOrder();
}
