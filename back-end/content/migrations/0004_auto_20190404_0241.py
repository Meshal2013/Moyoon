# Generated by Django 2.1.3 on 2019-04-03 23:41

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('content', '0003_auto_20190404_0236'),
    ]

    operations = [
        migrations.AlterField(
            model_name='category',
            name='name',
            field=models.CharField(max_length=35),
        ),
        migrations.AlterField(
            model_name='category',
            name='name_ar',
            field=models.CharField(max_length=35),
        ),
    ]
