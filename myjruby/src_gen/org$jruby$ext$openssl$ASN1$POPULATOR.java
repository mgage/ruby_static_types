/* THIS FILE IS GENERATED. DO NOT EDIT */
package org.jruby.gen;
import org.jruby.Ruby;
import org.jruby.RubyModule;
import org.jruby.RubyClass;
import org.jruby.CompatVersion;
import org.jruby.anno.TypePopulator;
import org.jruby.internal.runtime.methods.CallConfiguration;
import org.jruby.internal.runtime.methods.JavaMethod;
import org.jruby.internal.runtime.methods.DynamicMethod;
import org.jruby.runtime.Arity;
import org.jruby.runtime.Visibility;
import org.jruby.compiler.ASTInspector;
import java.util.Arrays;
import java.util.List;
public class org$jruby$ext$openssl$ASN1$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_IA5String(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_IA5String", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_IA5String", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("IA5String", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("IA5String", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_UTCTime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_UTCTime", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_UTCTime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("UTCTime", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("UTCTime", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_ISO64String(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_ISO64String", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_ISO64String", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("ISO64String", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("ISO64String", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_NumericString(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_NumericString", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_NumericString", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("NumericString", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("NumericString", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_PrintableString(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_PrintableString", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_PrintableString", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("PrintableString", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("PrintableString", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_GeneralizedTime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_GeneralizedTime", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_GeneralizedTime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("GeneralizedTime", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("GeneralizedTime", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_UTF8String(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_UTF8String", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_UTF8String", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("UTF8String", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("UTF8String", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$1$0$traverse(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "traverse", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "traverse", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("traverse", javaMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_Set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_Set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_Set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("Set", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("Set", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_Sequence(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_Sequence", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_Sequence", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("Sequence", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("Sequence", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_ObjectId(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_ObjectId", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_ObjectId", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("ObjectId", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("ObjectId", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_VideotexString(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_VideotexString", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_VideotexString", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("VideotexString", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("VideotexString", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_BitString(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_BitString", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_BitString", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("BitString", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("BitString", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_Null(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_Null", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_Null", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("Nul", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("Nul", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_Boolean(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_Boolean", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_Boolean", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("Boolean", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("Boolean", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$1$0$decode_all(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "decode_all", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "decode_all", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("decode_all", javaMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_GraphicString(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_GraphicString", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_GraphicString", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("GraphicString", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("GraphicString", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_T61String(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_T61String", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_T61String", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("T61String", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("T61String", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$1$0$decode(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "decode", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "decode", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("decode", javaMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_GeneralString(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_GeneralString", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_GeneralString", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("GeneralString", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("GeneralString", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_UniversalString(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_UniversalString", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_UniversalString", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("UniversalString", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("UniversalString", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_BMPString(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_BMPString", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_BMPString", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("BMPString", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("BMPString", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_OctetString(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_OctetString", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_OctetString", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("OctetString", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("OctetString", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_Enumerated(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_Enumerated", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_Enumerated", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("Enumerated", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("Enumerated", moduleMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$INVOKER$s$0$0$fact_Integer(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "fact_Integer", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.class, "fact_Integer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("Integer", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("Integer", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_IA5String","IA5String");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_UTCTime","UTCTime");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_ISO64String","ISO64String");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_NumericString","NumericString");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_PrintableString","PrintableString");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_GeneralizedTime","GeneralizedTime");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_UTF8String","UTF8String");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","traverse","traverse");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_Set","Set");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_Sequence","Sequence");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_ObjectId","ObjectId");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_VideotexString","VideotexString");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_BitString","BitString");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_Null","Nul");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_Boolean","Boolean");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","decode_all","decode_all");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_GraphicString","GraphicString");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_T61String","T61String");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","decode","decode");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_GeneralString","GeneralString");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_UniversalString","UniversalString");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_BMPString","BMPString");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_OctetString","OctetString");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_Enumerated","Enumerated");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1","fact_Integer","Integer");
    }
    static {
     }
}