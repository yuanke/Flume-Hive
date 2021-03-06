/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.cloudera.flume.conf.avro;

@SuppressWarnings("all")
public class CommandStatusAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"CommandStatusAvro\",\"namespace\":\"com.cloudera.flume.conf.avro\",\"fields\":[{\"name\":\"cmdId\",\"type\":\"long\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"message\",\"type\":\"string\"},{\"name\":\"cmd\",\"type\":{\"type\":\"record\",\"name\":\"FlumeMasterCommandAvro\",\"fields\":[{\"name\":\"command\",\"type\":\"string\"},{\"name\":\"arguments\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}}]}");
  public long cmdId;
  public java.lang.CharSequence state;
  public java.lang.CharSequence message;
  public com.cloudera.flume.conf.avro.FlumeMasterCommandAvro cmd;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return cmdId;
    case 1: return state;
    case 2: return message;
    case 3: return cmd;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: cmdId = (java.lang.Long)value$; break;
    case 1: state = (java.lang.CharSequence)value$; break;
    case 2: message = (java.lang.CharSequence)value$; break;
    case 3: cmd = (com.cloudera.flume.conf.avro.FlumeMasterCommandAvro)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
