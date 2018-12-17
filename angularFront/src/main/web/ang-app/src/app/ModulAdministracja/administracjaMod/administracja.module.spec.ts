import { AdministracjaModule } from './administracja.module';

describe('AdministracjaModule', () => {
  let administracjaModule: AdministracjaModule;

  beforeEach(() => {
    administracjaModule = new AdministracjaModule();
  });

  it('should create an instance', () => {
    expect(administracjaModule).toBeTruthy();
  });
});
