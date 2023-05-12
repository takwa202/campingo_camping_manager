import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HeaderComponent } from './components/header/header.component';
import { HomeComponent } from './components/home/home.component';
import { FooterComponent } from './components/footer/footer.component';

import { UserServiceService } from './Services/user-service.service';
import { FormsModule } from '@angular/forms';
import { CampsiteComponent } from './campsite/campsite.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PostsComponent } from './posts/posts.component';
import { NewsfeedComponent } from './newsfeed/newsfeed.component';
import { TheuserprofileComponent } from './theuserprofile/theuserprofile.component';
import { TheuserprofilepostesComponent } from './theuserprofilepostes/theuserprofilepostes.component';
import { EditComponent } from './edit/edit.component';
import { EditpostsComponent } from './editposts/editposts.component';
import { CommentsListComponent } from './comments-list/comments-list.component';
import { MapscomponentComponent } from './mapscomponent/mapscomponent.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    FooterComponent, CampsiteComponent, PostsComponent, NewsfeedComponent, TheuserprofileComponent, TheuserprofilepostesComponent, EditComponent, EditpostsComponent, CommentsListComponent, MapscomponentComponent
   
  ],
  imports: [

    BrowserModule, HttpClientModule,
    AppRoutingModule, FormsModule, BrowserAnimationsModule
  ],
  providers: [UserServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
