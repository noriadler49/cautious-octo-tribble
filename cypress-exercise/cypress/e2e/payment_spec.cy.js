
describe('Cart Test', () => {
  beforeEach(() => {
    cy.visit('https://www.saucedemo.com');
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
  });
    it('Should proceed to checkout step two after entering valid information', () => {
  // Thêm sản phẩm vào giỏ hàng
  cy.get('.inventory_item').first().find('.btn_inventory').click();

  // Đi tới giỏ hàng
  cy.get('.shopping_cart_link').click();

  // Nhấn Checkout
  cy.get('#checkout').click();

  // Nhập thông tin thanh toán
  cy.get('#first-name').type('John');
  cy.get('#last-name').type('Doe');
  cy.get('#postal-code').type('12345');

  // Nhấn Continue
  cy.get('#continue').click();

  // Xác minh chuyển sang trang xác nhận thanh toán
  cy.url().should('include', '/checkout-step-two.html');
    });
});

