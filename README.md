# FibonacciAPI

<div>1. ติดตั้ง Java Development Kit (JDK) ล่าสุดในเครื่องคอมพิวเตอร์ของคุณ โดยสามารถดาวน์โหลดได้จากเว็บไซต์ของ Oracle หรือ OpenJDK</div>
<div>
	2.ติดตั้ง Apache Maven:
	- ติดตั้ง Apache Maven เพื่อใช้ในการ build โปรเจค Maven ของคุณ โดยดาวน์โหลดจากเว็บไซต์ของ Apache Maven
</div>
<div>
	3.เตรียมโครงสร้างโปรเจค Maven:
	- สร้างโครงสร้างโปรเจค Maven ใหม่หรือเปิดโปรเจค Maven ที่มีอยู่แล้วใน IDE ของคุณ เช่น IntelliJ IDEA หรือ Eclipse
	- นำโค้ด Java ของ Fibonacci API มาวางในไฟล์ Java ที่ต้องการใช้งาน
</div>
<div>
4.เพิ่ม Dependencies ในไฟล์ pom.xml:
	- เพิ่ม dependencies สำหรับ Spark Framework และ Gson ในไฟล์ pom.xml เพื่อให้ Maven สามารถ resolve dependencies ได้
<dependency>
    <groupId>com.sparkjava</groupId>
    <artifactId>spark-core</artifactId>
    <version>2.9.1</version>
</dependency>
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>
</div>
<div>
5.Build โปรเจค Maven:
	- เปิด Command Prompt หรือ Terminal และเข้าไปยังไดเรกทอรีของโปรเจค Maven ของคุณ
	- ใช้คำสั่ง mvn clean install เพื่อ build โปรเจค Maven และติดตั้ง artifacts ใน local Maven repository
</div>
<div>
6.Run โปรแกรม:
	- หลังจากที่ build โปรเจค Maven เสร็จสิ้นแล้ว คุณสามารถรันโปรแกรมได้
	- ใน Command Prompt หรือ Terminal ใช้คำสั่ง java -jar your-project.jar เพื่อรัน JAR file ของโปรเจค Maven
	  หรือใช้ mvn exec:java เพื่อรัน Java application โดยใช้ Maven
</div>
<div>
7.ทดสอบ API:
	- เมื่อโปรแกรมรันอยู่ ลองทดสอบ API โดยเปิดเว็บเบราว์เซอร์และเข้าถึง URL http://localhost:3000/api/v1/test/{memberCount} โดยแทนค่า {memberCount} ด้วยจำนวนสมาชิกที่ต้องการในลำดับของ Fibonacci sequence
</div>
