package cache;

/**
* cache/WriterItfHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cache.idl
* vendredi 11 avril 2014 17 h 24 CEST
*/

public final class WriterItfHolder implements org.omg.CORBA.portable.Streamable
{
  public cache.WriterItf value = null;

  public WriterItfHolder ()
  {
  }

  public WriterItfHolder (cache.WriterItf initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = cache.WriterItfHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    cache.WriterItfHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return cache.WriterItfHelper.type ();
  }

}