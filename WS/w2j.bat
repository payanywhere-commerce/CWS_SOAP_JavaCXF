C:\Java\cxf\apache-cxf-2.2.10\bin\wsdl2java -d Txn -b JaxbBindingsTxn.xml -validate -verbose -autoNameResolution  -client   CwsTransactionProcessing.wsdl
rem C:\Java\cxf\apache-cxf-2.2.10\bin\wsdl2java  -d Svc -b JaxbBindingsSvcInfo.xml -validate -verbose -autoNameResolution -client   CWSServiceInformation.wsdl
rem C:\Java\cxf\apache-cxf-2.2.10\bin\wsdl2java -d Tms -b JaxbBindingsTms.xml -validate -verbose -autoNameResolution  -client   CWSTransactionManagement.wsdl
rem C:\Java\cxf\apache-cxf-2.2.10\bin\wsdl2java -d Billing -b JaxbBindingsBilling.xml -validate -verbose -autoNameResolution  -client   CWSDataServicesBilling.wsdl
pause