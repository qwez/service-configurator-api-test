# UserChoiceConfigurationControllerApi

All URIs are relative to *https://rrulmcoembw02.int.adeo.com:11122*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configureUsingPOST**](UserChoiceConfigurationControllerApi.md#configureUsingPOST) | **POST** /v0/configure | configure


<a name="configureUsingPOST"></a>
# **configureUsingPOST**
> ConfigurationResponse configureUsingPOST(request)

configure

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserChoiceConfigurationControllerApi;


UserChoiceConfigurationControllerApi apiInstance = new UserChoiceConfigurationControllerApi();
UserChoiceConfigurationRequest request = new UserChoiceConfigurationRequest(); // UserChoiceConfigurationRequest | request
try {
    ConfigurationResponse result = apiInstance.configureUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserChoiceConfigurationControllerApi#configureUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UserChoiceConfigurationRequest**](UserChoiceConfigurationRequest.md)| request |

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

