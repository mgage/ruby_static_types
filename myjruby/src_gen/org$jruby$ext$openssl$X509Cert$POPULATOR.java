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
public class org$jruby$ext$openssl$X509Cert$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$check_private_key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "check_private_key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "check_private_key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("check_private_key", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$set_version(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_version", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "set_version", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("version=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$initialize_copy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$to_der(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_der", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "to_der", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_der", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$set_not_before(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_not_before", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "set_not_before", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("not_before=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$set_extensions(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_extensions", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "set_extensions", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("extensions=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$issuer(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "issuer", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "issuer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("issuer", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$verify(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "verify", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "verify", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("verify", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$version(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "version", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "version", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("version", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$to_text(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_text", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "to_text", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_text", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$not_after(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "not_after", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "not_after", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("not_after", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$set_subject(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_subject", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "set_subject", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("subject=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$not_before(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "not_before", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "not_before", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("not_before", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$subject(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "subject", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "subject", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("subject", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$1$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameFullScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$set_public_key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_public_key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "set_public_key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("public_key=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$serial(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "serial", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "serial", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("serial", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$add_extension(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "add_extension", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "add_extension", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("add_extension", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$to_pem(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_pem", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "to_pem", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_pem", javaMethod);
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$2$0$sign(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "sign", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "sign", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("sign", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$extensions(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "extensions", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "extensions", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("extensions", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$signature_algorithm(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "signature_algorithm", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "signature_algorithm", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("signature_algorithm", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$set_issuer(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_issuer", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "set_issuer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("issuer=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$set_serial(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_serial", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "set_serial", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("serial=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$0$0$public_key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "public_key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "public_key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("public_key", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Cert$INVOKER$i$1$0$set_not_after(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_not_after", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Cert.class, "set_not_after", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("not_after=", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","check_private_key","check_private_key");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","set_version","version=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","to_der","to_der");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","set_not_before","not_before=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","set_extensions","extensions=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","issuer","issuer");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","verify","verify");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","version","version");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","to_text","to_text");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","not_after","not_after");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","set_subject","subject=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","not_before","not_before");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","subject","subject");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","set_public_key","public_key=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","serial","serial");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","inspect","inspect");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","add_extension","add_extension");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","to_pem","to_pem");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","sign","sign");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","extensions","extensions");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","signature_algorithm","signature_algorithm");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","set_issuer","issuer=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","set_serial","serial=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","public_key","public_key");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Cert","set_not_after","not_after=");
    }
    static {
        ASTInspector.addFrameAwareMethods("initialize");
     }
}