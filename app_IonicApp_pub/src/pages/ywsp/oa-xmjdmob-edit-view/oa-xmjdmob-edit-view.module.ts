import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_XMJDMobEditView } from './oa-xmjdmob-edit-view';




@NgModule({
  declarations: [
    OA_XMJDMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_XMJDMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_XMJDMobEditViewModule {}