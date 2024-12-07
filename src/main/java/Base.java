//package bkash;

import org.json.JSONObject;
import org.json.XML;

public class Base {

    public static void main(String[] args) {

        String xmlStrbillvalidation = "<soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\">\r\n" + //
                "   <soapenv:Body>\r\n" + //
                "      <tem:ApplyTransactionRequest xmlns:tem=\"http://tempuri.org/\" xmlns:at=\"http://cps.huawei.com/cpsinterface/goa/at\" xmlns:goa=\"http://cps.huawei.com/cpsinterface/goa\">\r\n" + //
                "         <at:Header>\r\n" + //
                "            <goa:CommandID>ValidationPayment</goa:CommandID>\r\n" + //
                "            <goa:Version>1.0</goa:Version>\r\n" + //
                "            <goa:LoginID>MFIAPI</goa:LoginID>\r\n" + //
                "            <goa:Password>N+7d5PL8r55ZFUqcJjdXzgwD8ryRyjK3OXMp+5AKqv0=</goa:Password>\r\n" + //
                "            <goa:Timestamp>20220110112054</goa:Timestamp>\r\n" + //
                "            <goa:ConversationID>9AA604WCY4</goa:ConversationID>\r\n" + //
                "         </at:Header>\r\n" + //
                "         <at:Body>\r\n" + //
                "            <at:Parameters>\r\n" + //
                "               <goa:Parameter>\r\n" + //
                "                  <goa:Key>ChannelCode</goa:Key>\r\n" + //
                "                  <goa:Value>{{channelCode}}</goa:Value>\r\n" + //
                "               </goa:Parameter>\r\n" + //
                "               <goa:Parameter>\r\n" + //
                "                  <goa:Key>PayAmount</goa:Key>\r\n" + //
                "                  <goa:Value>{{payAmount}}</goa:Value>\r\n" + //
                "               </goa:Parameter>\r\n" + //
                "            </at:Parameters>\r\n" + //
                "         </at:Body>\r\n" + //
                "      </tem:ApplyTransactionRequest>\r\n" + //
                "   </soapenv:Body>\r\n" + //
                "</soapenv:Envelope>";


        String xmlStrcheckinformation = "<soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                "    <soapenv:Body>\n" +
                "        <tem:ApplyTransactionRequest xmlns:tem=\"http://tempuri.org/\"\n" +
                "xmlns:at=\"http://cps.huawei.com/cpsinterface/goa/at\"\n" +
                "xmlns:goa=\"http://cps.huawei.com/cpsinterface/goa\">\n" +
                "            <at:Header>\n" +
                "                <goa:CommandID>CheckInformation</goa:CommandID>\n" +
                "                <goa:Version>1.0</goa:Version>\n" +
                "                <goa:LoginID>MFIAPI</goa:LoginID>\n" +
                "                <goa:Password>N+7d5PL8r55ZFUqcJjdXzgwD8ryRyjK3OXMp+5AKqv0=</goa:Password>\n" +
                "                <goa:Timestamp>20220110111810</goa:Timestamp>\n" +
                "                <goa:ConversationID>9AA304WCY1</goa:ConversationID>\n" +
                "                <goa:HeaderExtension>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>name</goa:Key>\n" +
                "                        <goa:Value>cps</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                </goa:HeaderExtension>\n" +
                "            </at:Header>\n" +
                "            <at:Body>\n" +
                "                <at:Parameters>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>IDNumber</goa:Key>\n" +
                "                        <goa:Value/>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>FullName</goa:Key>\n" +
                "                        <goa:Value>SEWEETY KHANOM</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>InquiryType</goa:Key>\n" +
                "                        <goa:Value>01</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>InquiryMode</goa:Key>\n" +
                "                        <goa:Value>02</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>FirstName</goa:Key>\n" +
                "                        <goa:Value>Tanveer</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>InitiatorID</goa:Key>\n" +
                "                        <goa:Value>8801301712997</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>ChannelCode</goa:Key>\n" +
                "                        <goa:Value>{{channelCode}}</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>LastName</goa:Key>\n" +
                "                        <goa:Value>Ghosh</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>PartnerID</goa:Key>\n" +
                "                        <goa:Value>MFI</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>ChkAmount</goa:Key>\n" +
                "                        <goa:Value>111</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>EndMonth</goa:Key>\n" +
                "                        <goa:Value>20120101</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>ExtendedParmeter1</goa:Key>\n" +
                "                        <goa:Value>Test1</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>SubID</goa:Key>\n" +
                "                        <goa:Value>11111</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>AccountID</goa:Key>\n" +
                "                        <goa:Value>{{accountId2}}</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                    <goa:Parameter>\n" +
                "                        <goa:Key>StartMonth</goa:Key>\n" +
                "                        <goa:Value>20120101</goa:Value>\n" +
                "                    </goa:Parameter>\n" +
                "                </at:Parameters>\n" +
                "            </at:Body>\n" +
                "        </tem:ApplyTransactionRequest>\n" +
                "    </soapenv:Body>\n" +
                "</soapenv:Envelope>";

        String xmlStrbillpayment ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<soapenv:Envelope xmlns:soapenv=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                "   <soapenv:Body>\n" +
                "      <tem:ApplyTransactionRequest xmlns:tem=\"http://tempuri.org/\" xmlns:at=\"http://cps.huawei.com/cpsinterface/goa/at\" xmlns:goa=\"http://cps.huawei.com/cpsinterface/goa\">\n" +
                "         <at:Header>\n" +
                "            <goa:CommandID>PaymentConfirmation</goa:CommandID>\n" +
                "            <goa:Version>1.0</goa:Version>\n" +
                "            <goa:LoginID>MFIAPI</goa:LoginID>\n" +
                "            <goa:Password>N+7d5PL8r55ZFUqcJjdXzgwD8ryRyjK3OXMp+5AKqv0=</goa:Password>\n" +
                "            <goa:Timestamp>20220110112055</goa:Timestamp>\n" +
                "            <goa:ConversationID>9AA604WCY4</goa:ConversationID>\n" +
                "            <goa:HeaderExtension>\n" +
                "               <goa:Parameter>\n" +
                "                  <goa:Key>name</goa:Key>\n" +
                "                  <goa:Value>cps</goa:Value>\n" +
                "               </goa:Parameter>\n" +
                "            </goa:HeaderExtension>\n" +
                "         </at:Header>\n" +
                "         <at:Body>\n" +
                "            <at:Parameters>\n" +
                "               <goa:Parameter>\n" +
                "                  <goa:Key>PartnerIntentRef</goa:Key>\n" +
                "                  <goa:Value>{{partnerIntentRef}}</goa:Value>\n" +
                "               </goa:Parameter>\n" +
                "               <goa:Parameter>\n" +
                "                  <goa:Key>bKashTrxRef</goa:Key>\n" +
                "                  <goa:Value>{{bKashTrxRef}}</goa:Value>\n" +
                "               </goa:Parameter>\n" +
                "               <goa:Parameter>\n" +
                "                  <goa:Key>bKashCompletionTime</goa:Key>\n" +
                "                  <goa:Value>{{bKashCompletionTime}}</goa:Value>\n" +
                "               </goa:Parameter>\n" +
                "               <goa:Parameter>\n" +
                "                  <goa:Key>ActualTRXTime</goa:Key>\n" +
                "                  <goa:Value>{{bKashCompletionTime}}</goa:Value>\n" +
                "               </goa:Parameter>\n" +
                "               <goa:Parameter>\n" +
                "                  <goa:Key>PartnerID</goa:Key>\n" +
                "                  <goa:Value>MFI</goa:Value>\n" +
                "               </goa:Parameter>\n" +
                "            </at:Parameters>\n" +
                "         </at:Body>\n" +
                "      </tem:ApplyTransactionRequest>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        JSONObject billvalidation = XML.toJSONObject(xmlStrbillvalidation);
        JSONObject checkinformation = XML.toJSONObject(xmlStrcheckinformation);
        JSONObject billpayment = XML.toJSONObject(xmlStrbillpayment);
        //System.out.println(billvalidation);
        //System.out.println(checkinformation);
        System.out.println(billpayment);

    }
}