package com.test.mytest;

import com.epam.jdi.uitests.core.interfaces.base.IElement;
import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ILabel;
import com.epam.jdi.uitests.core.interfaces.common.ILink;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Alexander_Petrovskiy on 6/3/2016.
 */
public class HomePage extends WebPage {
// http://localhost:1234/bootstrap/users

    @FindBy(linkText="/Content/bootstrap.css")
    public ILink linkContentBootstrapCss;

    @FindBy(linkText="/Content/cerulean.bootstrap.min.css")
    public ILink linkContentCeruleanBootstrapMinCss;

    @FindBy(linkText="/bootstrap/users/328407e0-6844-4edc-8f08-378f9aea5a54")
    public ILink aBootstrapUsers328407e068444edc8f08378f9aea5a54;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/form")
    public IElement formNoName;

    @FindBy(name="_method")
    public ITextField input_method;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td")
    public IElement tdNoName;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td/input")
    public ITextField inputNoName;

    @FindBy(linkText="/bootstrap/users/2a0d2de7-a0ae-46d6-80b4-8241a54d9aef")
    public ILink aBootstrapUsers2a0d2de7A0ae46d680b48241a54d9aef;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/form")
    public IElement formNoName1;

    @FindBy(name="_method")
    public ITextField input_method1;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td")
    public IElement tdNoName1;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td/input")
    public ITextField inputNoName1;

    @FindBy(linkText="/bootstrap/users/7d8d0922-883b-4c28-b780-b4be6aeace4e")
    public ILink aBootstrapUsers7d8d0922883b4c28B780B4be6aeace4e;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/form")
    public IElement formNoName2;

    @FindBy(name="_method")
    public ITextField input_method2;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td")
    public IElement tdNoName2;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td/input")
    public ITextField inputNoName2;

    @FindBy(linkText="/bootstrap/users/20003adc-783e-47ee-8d6e-d82ea6ae79b4")
    public ILink aBootstrapUsers20003adc783e47ee8d6eD82ea6ae79b4;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/form")
    public IElement formNoName3;

    @FindBy(name="_method")
    public ITextField input_method3;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td")
    public IElement tdNoName3;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td/input")
    public ITextField inputNoName3;

    @FindBy(linkText="/bootstrap/users/03d38c3d-ef41-4afa-b9a2-c66a88aaf9b5")
    public ILink aBootstrapUsers03d38c3dEf414afaB9a2C66a88aaf9b5;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/form")
    public IElement formNoName4;

    @FindBy(name="_method")
    public ITextField input_method4;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td")
    public IElement tdNoName4;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td/input")
    public ITextField inputNoName4;

    @FindBy(linkText="/bootstrap/users/92421fa4-7f7b-4680-b122-84be02773fa4")
    public ILink aBootstrapUsers92421fa47f7b4680B12284be02773fa4;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/form")
    public IElement formNoName5;

    @FindBy(name="_method")
    public ITextField input_method5;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td")
    public IElement tdNoName5;

    @FindBy(xpath="//div/div[@class='panel-body']/div[@class='row']/div/td/input")
    public ITextField inputNoName5;

    @FindBy(className="btn btn-danger btn-sm")
    public ILink aNoName;

    @FindBy(className="btn btn-default btn-sm")
    public ILink aNoName1;

    @FindBy(id="createUserId")
    public ILink aCreateUser;

    @FindBy(id="createUserId")
    public ILink aCreateUser1;

    @FindBy(className="btn btn-default")
    public IButton buttonBtnBtnDefault;

    @FindBy(className="btn btn-default")
    public IButton buttonBtnBtnDefault1;

    @FindBy(className="btn btn-default")
    public IButton buttonBtnBtnDefault2;
}
