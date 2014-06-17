tbc-telemetry-system-java
=========================

The Telemetry System in Java is the 4th of the 4 TDD with Mock Objects (see Luca Minudel's repo https://github.com/lucaminudel/TDDwithMockObjectsAndDesignPrinciples) katas in my book Taming the Bad Code with Katas.

本repo是我正在撰写的《操练驯服烂代码》一书中的用TDD驯服烂代码的4个mock操练例子中的第4个。这个例子的源代码来自ThoughtWorks Studio的培训师和教练Luca Minudel在两年前设计的编程操练系列题目TDD with Mock Objects。这个题目是个遥测系统。有两个类：一个是TelemetryClient类，用来实现与服务器通讯的下述功能，包括连接服务器、断开服务器、获取与服务器的连接状态、向服务器发送获得其诊断信息的请求、从服务器接收其诊断信息；另一个是TelemetryDiagnosticControls类，它利用TelemetryClient类的上述功能来检查与服务器的通讯状态，并最终获得服务器的诊断信息。操练要求为TelemetryDiagnosticControls类编写单元测试。
