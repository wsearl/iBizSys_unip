import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_QXJQXJLC_W30_MobWFEditView3 } from './oa-qxjqxjlc-w30-mob-wfedit-view3';



import { WFStepDataMobMDView9Module } from '../../ywsp/wfstep-data-mob-mdview9/wfstep-data-mob-mdview9.module';

@NgModule({
  declarations: [
    OA_QXJQXJLC_W30_MobWFEditView3,
  ],
  imports: [
    IonicPageModule.forChild(OA_QXJQXJLC_W30_MobWFEditView3),
    IBizSysModule,
    UserModule,
    WFStepDataMobMDView9Module,
  ],
})
export class OA_QXJQXJLC_W30_MobWFEditView3Module {}