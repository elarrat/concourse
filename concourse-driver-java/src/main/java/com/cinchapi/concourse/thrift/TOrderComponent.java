/*
 * Copyright (c) 2013-2020 Cinchapi Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cinchapi.concourse.thrift;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
/**
 * Encapsulation for a single order component (key, direction and optional
 * selection timestamp for the key).
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2019-05-29")
public class TOrderComponent implements
        org.apache.thrift.TBase<TOrderComponent, TOrderComponent._Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<TOrderComponent> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
            "TOrderComponent");

    private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField(
            "key", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField(
            "timestamp", org.apache.thrift.protocol.TType.STRUCT, (short) 2);
    private static final org.apache.thrift.protocol.TField DIRECTION_FIELD_DESC = new org.apache.thrift.protocol.TField(
            "direction", org.apache.thrift.protocol.TType.I32, (short) 3);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
        schemes.put(StandardScheme.class,
                new TOrderComponentStandardSchemeFactory());
        schemes.put(TupleScheme.class, new TOrderComponentTupleSchemeFactory());
    }

    public String key; // required
    public TObject timestamp; // optional
    public int direction; // required

    /**
     * The set of fields this struct contains, along with convenience methods
     * for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        KEY((short) 1, "key"),
        TIMESTAMP((short) 2, "timestamp"),
        DIRECTION((short) 3, "direction");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not
         * found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
            case 1: // KEY
                return KEY;
            case 2: // TIMESTAMP
                return TIMESTAMP;
            case 3: // DIRECTION
                return DIRECTION;
            default:
                return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if(fields == null)
                throw new IllegalArgumentException(
                        "Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not
         * found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __DIRECTION_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    @SuppressWarnings("unused")
    private static final _Fields optionals[] = { _Fields.TIMESTAMP };
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
                _Fields.class);
        tmpMap.put(_Fields.KEY,
                new org.apache.thrift.meta_data.FieldMetaData("key",
                        org.apache.thrift.TFieldRequirementType.REQUIRED,
                        new org.apache.thrift.meta_data.FieldValueMetaData(
                                org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.TIMESTAMP,
                new org.apache.thrift.meta_data.FieldMetaData("timestamp",
                        org.apache.thrift.TFieldRequirementType.OPTIONAL,
                        new org.apache.thrift.meta_data.StructMetaData(
                                org.apache.thrift.protocol.TType.STRUCT,
                                TObject.class)));
        tmpMap.put(_Fields.DIRECTION,
                new org.apache.thrift.meta_data.FieldMetaData("direction",
                        org.apache.thrift.TFieldRequirementType.REQUIRED,
                        new org.apache.thrift.meta_data.FieldValueMetaData(
                                org.apache.thrift.protocol.TType.I32)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData
                .addStructMetaDataMap(TOrderComponent.class, metaDataMap);
    }

    public TOrderComponent() {}

    public TOrderComponent(String key, int direction) {
        this();
        this.key = key;
        this.direction = direction;
        setDirectionIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public TOrderComponent(TOrderComponent other) {
        __isset_bitfield = other.__isset_bitfield;
        if(other.isSetKey()) {
            this.key = other.key;
        }
        if(other.isSetTimestamp()) {
            this.timestamp = new TObject(other.timestamp);
        }
        this.direction = other.direction;
    }

    public TOrderComponent deepCopy() {
        return new TOrderComponent(this);
    }

    @Override
    public void clear() {
        this.key = null;
        this.timestamp = null;
        setDirectionIsSet(false);
        this.direction = 0;
    }

    public String getKey() {
        return this.key;
    }

    public TOrderComponent setKey(String key) {
        this.key = key;
        return this;
    }

    public void unsetKey() {
        this.key = null;
    }

    /**
     * Returns true if field key is set (has been assigned a value) and false
     * otherwise
     */
    public boolean isSetKey() {
        return this.key != null;
    }

    public void setKeyIsSet(boolean value) {
        if(!value) {
            this.key = null;
        }
    }

    public TObject getTimestamp() {
        return this.timestamp;
    }

    public TOrderComponent setTimestamp(TObject timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public void unsetTimestamp() {
        this.timestamp = null;
    }

    /**
     * Returns true if field timestamp is set (has been assigned a value) and
     * false otherwise
     */
    public boolean isSetTimestamp() {
        return this.timestamp != null;
    }

    public void setTimestampIsSet(boolean value) {
        if(!value) {
            this.timestamp = null;
        }
    }

    public int getDirection() {
        return this.direction;
    }

    public TOrderComponent setDirection(int direction) {
        this.direction = direction;
        setDirectionIsSet(true);
        return this;
    }

    public void unsetDirection() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield,
                __DIRECTION_ISSET_ID);
    }

    /**
     * Returns true if field direction is set (has been assigned a value) and
     * false otherwise
     */
    public boolean isSetDirection() {
        return EncodingUtils.testBit(__isset_bitfield, __DIRECTION_ISSET_ID);
    }

    public void setDirectionIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield,
                __DIRECTION_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
        case KEY:
            if(value == null) {
                unsetKey();
            }
            else {
                setKey((String) value);
            }
            break;

        case TIMESTAMP:
            if(value == null) {
                unsetTimestamp();
            }
            else {
                setTimestamp((TObject) value);
            }
            break;

        case DIRECTION:
            if(value == null) {
                unsetDirection();
            }
            else {
                setDirection((Integer) value);
            }
            break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
        case KEY:
            return getKey();

        case TIMESTAMP:
            return getTimestamp();

        case DIRECTION:
            return getDirection();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned
     * a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if(field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
        case KEY:
            return isSetKey();
        case TIMESTAMP:
            return isSetTimestamp();
        case DIRECTION:
            return isSetDirection();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if(that == null)
            return false;
        if(that instanceof TOrderComponent)
            return this.equals((TOrderComponent) that);
        return false;
    }

    public boolean equals(TOrderComponent that) {
        if(that == null)
            return false;

        boolean this_present_key = true && this.isSetKey();
        boolean that_present_key = true && that.isSetKey();
        if(this_present_key || that_present_key) {
            if(!(this_present_key && that_present_key))
                return false;
            if(!this.key.equals(that.key))
                return false;
        }

        boolean this_present_timestamp = true && this.isSetTimestamp();
        boolean that_present_timestamp = true && that.isSetTimestamp();
        if(this_present_timestamp || that_present_timestamp) {
            if(!(this_present_timestamp && that_present_timestamp))
                return false;
            if(!this.timestamp.equals(that.timestamp))
                return false;
        }

        boolean this_present_direction = true;
        boolean that_present_direction = true;
        if(this_present_direction || that_present_direction) {
            if(!(this_present_direction && that_present_direction))
                return false;
            if(this.direction != that.direction)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_key = true && (isSetKey());
        list.add(present_key);
        if(present_key)
            list.add(key);

        boolean present_timestamp = true && (isSetTimestamp());
        list.add(present_timestamp);
        if(present_timestamp)
            list.add(timestamp);

        boolean present_direction = true;
        list.add(present_direction);
        if(present_direction)
            list.add(direction);

        return list.hashCode();
    }

    @Override
    public int compareTo(TOrderComponent other) {
        if(!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetKey())
                .compareTo(other.isSetKey());
        if(lastComparison != 0) {
            return lastComparison;
        }
        if(isSetKey()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key,
                    other.key);
            if(lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetTimestamp())
                .compareTo(other.isSetTimestamp());
        if(lastComparison != 0) {
            return lastComparison;
        }
        if(isSetTimestamp()) {
            lastComparison = org.apache.thrift.TBaseHelper
                    .compareTo(this.timestamp, other.timestamp);
            if(lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetDirection())
                .compareTo(other.isSetDirection());
        if(lastComparison != 0) {
            return lastComparison;
        }
        if(isSetDirection()) {
            lastComparison = org.apache.thrift.TBaseHelper
                    .compareTo(this.direction, other.direction);
            if(lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot)
            throws org.apache.thrift.TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot)
            throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOrderComponent(");
        boolean first = true;

        sb.append("key:");
        if(this.key == null) {
            sb.append("null");
        }
        else {
            sb.append(this.key);
        }
        first = false;
        if(isSetTimestamp()) {
            if(!first)
                sb.append(", ");
            sb.append("timestamp:");
            if(this.timestamp == null) {
                sb.append("null");
            }
            else {
                sb.append(this.timestamp);
            }
            first = false;
        }
        if(!first)
            sb.append(", ");
        sb.append("direction:");
        sb.append(this.direction);
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        if(key == null) {
            throw new org.apache.thrift.protocol.TProtocolException(
                    "Required field 'key' was not present! Struct: "
                            + toString());
        }
        // alas, we cannot check 'direction' because it's a primitive and you
        // chose the non-beans generator.
        // check for sub-struct validity
        if(timestamp != null) {
            timestamp.validate();
        }
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(out)));
        }
        catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in)
            throws java.io.IOException, ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java
            // serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(in)));
        }
        catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class TOrderComponentStandardSchemeFactory implements
            SchemeFactory {
        public TOrderComponentStandardScheme getScheme() {
            return new TOrderComponentStandardScheme();
        }
    }

    private static class TOrderComponentStandardScheme
            extends StandardScheme<TOrderComponent> {

        public void read(org.apache.thrift.protocol.TProtocol iprot,
                TOrderComponent struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                case 1: // KEY
                    if(schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                        struct.key = iprot.readString();
                        struct.setKeyIsSet(true);
                    }
                    else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                                schemeField.type);
                    }
                    break;
                case 2: // TIMESTAMP
                    if(schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                        struct.timestamp = new TObject();
                        struct.timestamp.read(iprot);
                        struct.setTimestampIsSet(true);
                    }
                    else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                                schemeField.type);
                    }
                    break;
                case 3: // DIRECTION
                    if(schemeField.type == org.apache.thrift.protocol.TType.I32) {
                        struct.direction = iprot.readI32();
                        struct.setDirectionIsSet(true);
                    }
                    else {
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                                schemeField.type);
                    }
                    break;
                default:
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                            schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be
            // checked in the validate method
            if(!struct.isSetDirection()) {
                throw new org.apache.thrift.protocol.TProtocolException(
                        "Required field 'direction' was not found in serialized data! Struct: "
                                + toString());
            }
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot,
                TOrderComponent struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if(struct.key != null) {
                oprot.writeFieldBegin(KEY_FIELD_DESC);
                oprot.writeString(struct.key);
                oprot.writeFieldEnd();
            }
            if(struct.timestamp != null) {
                if(struct.isSetTimestamp()) {
                    oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
                    struct.timestamp.write(oprot);
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldBegin(DIRECTION_FIELD_DESC);
            oprot.writeI32(struct.direction);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class TOrderComponentTupleSchemeFactory implements
            SchemeFactory {
        public TOrderComponentTupleScheme getScheme() {
            return new TOrderComponentTupleScheme();
        }
    }

    private static class TOrderComponentTupleScheme
            extends TupleScheme<TOrderComponent> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot,
                TOrderComponent struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            oprot.writeString(struct.key);
            oprot.writeI32(struct.direction);
            BitSet optionals = new BitSet();
            if(struct.isSetTimestamp()) {
                optionals.set(0);
            }
            oprot.writeBitSet(optionals, 1);
            if(struct.isSetTimestamp()) {
                struct.timestamp.write(oprot);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot,
                TOrderComponent struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            struct.key = iprot.readString();
            struct.setKeyIsSet(true);
            struct.direction = iprot.readI32();
            struct.setDirectionIsSet(true);
            BitSet incoming = iprot.readBitSet(1);
            if(incoming.get(0)) {
                struct.timestamp = new TObject();
                struct.timestamp.read(iprot);
                struct.setTimestampIsSet(true);
            }
        }
    }

}
