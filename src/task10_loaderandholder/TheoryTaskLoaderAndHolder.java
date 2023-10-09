package task10_loaderandholder;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 1.
 * Что такое "чистый загрузчик классов" (pure class loader), и в каких случаях
 * он может быть полезен для изоляции классов?
 *
 * 2.Что такое "контекст класслоадера" (context class loader), и каким образом
 * он используется в многопоточных приложениях и при загрузке ресурсов?

 */
public class TheoryTaskLoaderAndHolder {
    /**
     * Как работает этот класс?
     */
    public static class ByteArrayClassLoader extends ClassLoader {
        public Class<?> defineClassFromBytes(String className, byte[] classBytes) {
            return defineClass(className, classBytes, 0, classBytes.length);
        }
    }

    public static void main(String[] args) throws Exception {
        byte[] classBytes = Files.readAllBytes(Paths.get("MyClass.class"));
        ByteArrayClassLoader classLoader = new ByteArrayClassLoader();
        Class<?> clazz = classLoader.defineClassFromBytes("com.example.MyClass", classBytes);
        // Object instance = clazz.newInstance(); // Commented out as it is not used
        // Используем класс и экземпляр
    }
}